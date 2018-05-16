<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Examples</title>
<meta name="description" content="">
<meta name="keywords" content="">
<link href="" rel="stylesheet">
<link href="/css/project.css" rel="stylesheet">
</head>
<body>
	<h2 class="hello-title">On ${target} Hello ${name}!</h2>

    <img src="/images/fileviewer/ppt_icon.png"/>

    <script src="/js/jquery.min.js"></script>
    <script src="/js/tabs.js"></script>
    <script src="/js/content-viewer.js"></script>
    <script>
        $(document).ready(function() {
            $('.moft_tab').moftTabs();
            $('.moft_content_viewer').moftContentViewer();
            $('.resources_btn').click(function(e) {
                $('.resources_view_wrap').hide();
                var targetView = $('#' + $(this).data('resources-view'));
                if (targetView.length > 0) {
                    targetView.show();
                }
            });
            $('.resources_view_header').on('click', '.close_btn', function(e) {
                $('.resources_view_wrap').hide();
            });
        });
    </script>
</body>
</html>