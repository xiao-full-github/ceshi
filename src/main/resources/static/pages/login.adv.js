var isCloud = false;
if ($(".t-table").hasClass("t-cloud")) isCloud = true;
var imgWidth = isCloud ? 455 : 385;
var Class = {
    create: function () {
        return function () {
            this.initialize.apply(this, arguments)
        }
    }
};
Object.extend = function (destination, source) {
    for (var property in source) destination[property] = source[property];
    return destination
};
var TransformView = Class.create();
TransformView.prototype = {
    initialize: function (container, slider, parameter, count, options) {
        if (parameter <= 0 || count <= 0) return;
        var oContainer = document.getElementById(container), oSlider = document.getElementById(slider), oThis = this;
        this.Index = 0;
        this._timer = null;
        this._slider = oSlider;
        this._parameter = parameter;
        this._count = count || 0;
        this._target = 0;
        this.SetOptions(options);
        this.Up = !!this.options.Up;
        this.Step = Math.abs(this.options.Step);
        this.Time = Math.abs(this.options.Time);
        this.Auto = !!this.options.Auto;
        this.Pause =
            Math.abs(this.options.Pause);
        this.onStart = this.options.onStart;
        this.onFinish = this.options.onFinish;
        oContainer.style.overflow = "hidden";
        oContainer.style.position = "relative";
        oSlider.style.position = "absolute";
        oSlider.style.top = oSlider.style.left = 0
    }, SetOptions: function (options) {
        this.options = {
            Up: true, Step: 10, Time: 10, Auto: true, Pause: 5E3, onStart: function () {
            }, onFinish: function () {
            }
        };
        Object.extend(this.options, options || {})
    }, Start: function () {
        if (this.Index < 0) this.Index = this._count - 1; else if (this.Index >= this._count) this.Index =
            0;
        this._target = -1 * this._parameter * this.Index;
        this.onStart();
        this.Move()
    }, Move: function () {
        clearTimeout(this._timer);
        var oThis = this, style = this.Up ? "top" : "left", iNow = parseInt(this._slider.style[style]) || 0,
            iStep = this.GetStep(this._target, iNow);
        if (iStep != 0) {
            this._slider.style[style] = iNow + iStep + "px";
            this._timer = setTimeout(function () {
                oThis.Move()
            }, this.Time)
        } else {
            this._slider.style[style] = this._target + "px";
            this.onFinish();
            if (this.Auto) this._timer = setTimeout(function () {
                oThis.Index++;
                oThis.Start()
            }, this.Pause)
        }
    },
    GetStep: function (iTarget, iNow) {
        var iStep = (iTarget - iNow) / this.Step;
        if (iStep == 0) return 0;
        if (Math.abs(iStep) < 1) return iStep > 0 ? 1 : -1;
        return iStep
    }, Stop: function (iTarget, iNow) {
        clearTimeout(this._timer);
        this._slider.style[this.Up ? "top" : "left"] = this._target + "px"
    }
};
ChartSwitch = function (imgCount) {
    if (imgCount == null) imgCount = 4;

    function Each(list, fun) {
        for (var i = 0, len = list.length; i < len; i++) fun(list[i], i)
    }

    var objs = document.getElementById("idNum2").getElementsByTagName("li");
    var tv = new TransformView("idTransformView2", "idSlider2", imgWidth, 3, {
        onStart: function () {
            Each(objs, function (o, i) {
                o.className = tv.Index == i ? "on" : ""
            })
        }, Up: false
    });
    tv.Start();
    window.transformview = tv;
    Each(objs, function (o, i) {
        o.onmouseover = function () {
            o.className = "on";
            tv.Auto = false;
            tv.Index = i;
            tv.Start()
        };
        o.onmouseout = function () {
            o.className = "";
            tv.Auto = true;
            tv.Start()
        }
    });
    var objsChart = document.getElementById("idSlider2").getElementsByTagName("li");
    Each(objsChart, function (o, i) {
        o.onmouseover = function () {
            o.className = "on";
            tv.Auto = false;
            tv.Index = i;
            tv.Start()
        };
        o.onmouseout = function () {
            o.className = "";
            tv.Auto = true;
            tv.Start()
        }
    })
};
setTimeout(function () {
    if ($(".t-table").hasClass("t-cloud")) isCloud = true;
    imgWidth = isCloud ? 455 : 385;
    ChartSwitch()
}, 100);
+function () {
    var NewDate = function (str) {
        if (!str) return 0;
        var arr = str.split(" ");
        var d = arr[0].split("-");
        var date = new Date;
        date.setUTCFullYear(d[0], d[1] - 1, d[2]);
        if (arr.length > 1) {
            var t = arr[1].split(":");
            date.setUTCHours(t[0], t[1], t[2], 0)
        } else date.setUTCHours(0, 0, 0, 0);
        return date
    };
    if (location.search.indexOf("offline") != -1) return;
    var url = location.protocol + "//advertisetplus.chanjet.com/adv/news/news.js";
    try {
        window.shownews = function (news) {
            var links = $("#idSlider2 a");
            for (var i = 0; i < news.length; i++) {
                var n =
                    news[i];
                if (n == null || n.img == null) continue;
                var begintime = NewDate(n.begintime);
                var endtime = NewDate(n.endtime);
                var now = new Date;
                if (begintime > now || endtime < now) continue;
                var count = i;
                if (n.index) count = n.index - 1;
                if (n.url) links[count].href = n.url;
                if (n.img) $(links[count]).find(".t-adv-img").attr("src", n.img).addClass("t-login-customimg");
                if (n.bcode) $(links[count]).find(".t-bcode").attr("src", n.bcode).addClass("t-login-custombcode").show(); else $(links[count]).find(".t-bcode").hide();
                $(links[count]).find("span").hide();
                if (n.desc) $(links[count]).append("<div class='t-display-center t-login-customtext'><span>" + n.desc + "</span></div>")
            }
        };
        var head = document.getElementsByTagName("head")[0];
        var script = document.createElement("script");
        script.type = "text/javascript";
        script.onload = function () {
            if (typeof loginnews != "undefined") window.shownews(loginnews)
        };
        script.onerror = function () {
            console.log("no connection!")
        };
        script.src = url;
        head.appendChild(script)
    } catch (e) {
    }
}();
