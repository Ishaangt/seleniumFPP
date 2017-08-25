            $(document).ready(function(){
                var line1 = [2,1,1,0,1,5,0,5,5,0,4,0,0,5,4,0,3,4,0,3,5,0,5,6,6,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,6,3,1,0,2,9,0,0,1,0,1,1,1,1,0,0,1,1,1,0,1,10,0,0,0,2,1,1,0,1,0,1,1,3,9,1,1,0,31,3,2,0,5,1,1,9,1,1,1,1,9,1,1,7,7,10,9,10,0,0,1,1,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0];
                var line2 = [0,1,1,0,5,1,0,1,1,0,2,0,0,1,2,0,3,2,0,3,1,0,1,0,0,2,2,2,2,2,2,2,2,1,1,1,1,1,2,2,2,2,1,2,0,4,1,1,0,1,0,0,0,0,1,1,0,0,0,1,0,3,2,2,2,0,0,0,1,0,1,0,0,0,1,1,1,1,12,7,0,1,5,0,0,1,0,0,0,0,1,0,0,3,3,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,1,1];
                var line3 = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];

var ticks = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16];$.jqplot('line', [line1, line2, line3], {
        animate: true,
axesDefaults:{min:0,tickInterval: 1},        seriesDefaults: {
            rendererOptions: {
                smooth: true
            }
        },
        series: [{lineWidth: 1.5, label: 'Passed'},
            {lineWidth: 1.5, label: 'Failed'},
            {lineWidth: 1.5, label: 'Skipped'}],
        axes: {
            xaxis: {
                label: "Run Number",
                ticks: ticks,
                tickOptions: {
                    formatString: "%'d "
                },
                pad: 1.2,
                rendererOptions: {
                    tickInset: 0.3,
                    minorTicks: 1
                }
            },
            yaxis: {
                label: "TC Number"
                ,tickOptions: {
                    formatString: "%'d Tc"
                },
            }
        },
        highlighter: {
            show: true,
            sizeAdjust: 10,
            tooltipLocation: 'n',
            tooltipAxes: 'y',
            tooltipFormatString: '%d :&nbsp;<b><i><span style="color:black;">Test Cases</span></i></b>',
            useAxesFormatters: false
        },
        cursor: {
            show: true
        },
        grid: {background: '#ffffff', drawGridLines: true, gridLineColor: '#cccccc', borderColor: '#cccccc',
            borderWidth: 0.5, shadow: false},
        legend: {show: true, placement: 'outside', location: 'e'},
        seriesColors: ["#7BB661", "#E03C31", "#21ABCD"]
    });
});
