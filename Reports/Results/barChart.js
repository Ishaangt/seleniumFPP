            $(document).ready(function(){
                var s1 = [0,5,5,0,4,0,0,5,4,0,3,4,0,3,5,0,5,6,6,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,6,3,1,0,2,9,0,0,1,0,1,1,1,1,0,0,1,1,1,0,1,10,0,0,0,2,1,1,0,1,0,1,1,3,9,1,1,0,31,3,2,0,5,1,1,9,1,1,1,1,9,1,1,7,7,10,9,10,0,0,1,1,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0];
                var s2 = [0,1,1,0,2,0,0,1,2,0,3,2,0,3,1,0,1,0,0,2,2,2,2,2,2,2,2,1,1,1,1,1,2,2,2,2,1,2,0,4,1,1,0,1,0,0,0,0,1,1,0,0,0,1,0,3,2,2,2,0,0,0,1,0,1,0,0,0,1,1,1,1,12,7,0,1,5,0,0,1,0,0,0,0,1,0,0,3,3,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,1,1];
                var s3 = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];

var ticks = [7,8,9,10,11,12,13,14,15,16];    $.jqplot('bar', [s1, s2, s3], {
        animate: true,axesDefaults:{min:0,tickInterval: 1},        seriesColors: ["#7BB661", "#E03C31", "#21ABCD"],
        stackSeries: false,
        seriesDefaults: {
            renderer: $.jqplot.BarRenderer,
            pointLabels: {show: true}
            , rendererOptions: {barWidth: 12, barMargin: 25, fillToZero: true}
        }
        ,
        grid: {borderColor: '#ffffff', background: '#ffffff',
            borderWidth: 0.5, // pixel width of border around grid.
            shadow: false // draw a shadow for grid.
        }
        ,
        legend: {
            show: true,
            location: 'e',
            placement: 'outside',
            labels: ['Passed', 'Failed', 'Skipped']
        },
        axes: {
            xaxis: {
                renderer: $.jqplot.CategoryAxisRenderer,
                ticks: ticks,
                label: "Run Number"
            }
            ,
            yaxis: {
                label: "TC Number",
                tickOptions: {
                    formatString: "%dtc"
                }
            }
        }
    });
});
