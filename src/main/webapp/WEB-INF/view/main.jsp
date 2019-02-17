<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="theme-color" content="#ffffff">
    <meta name="description" content="KENDO UI Practice" />
    <title>sprint7 | Filter</title>

    <link type="text/css" rel="stylesheet" href="<c:url value="/css/lib/kendo.common.min.css" />" media="all"/>
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/lib/kendo.rtl.min.css" />" media="all"/>
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/lib/kendo.silver.min.css" />" media="all"/>
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/lib/kendo.mobile.all.min.css" />" media="all"/>
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/common.css" />" media="all"/>

    <script type="text/javascript" src="<c:url value="/js/lib/jquery.min.js" />" charset="UTF-8"></script>
    <script type="text/javascript" src="<c:url value="/js/lib/jquery.i18n.properties.min.js" />" charset="UTF-8"></script>
    <script type="text/javascript" src="<c:url value="/js/lib/jszip.min.js" />" charset="UTF-8"></script>
    <script type="text/javascript" src="<c:url value="/js/lib/kendo.all.min.js" />" charset="UTF-8"></script>
    <script type="text/javascript" src="<c:url value="/js/lib/kendo.mobile.min.js" />" charset="UTF-8"></script>
    <script type="text/javascript" src="<c:url value="/js/common.js" />" charset="UTF-8"></script>
    <script type="text/javascript" src="<c:url value="/js/sprint7-1.js" />" charset="UTF-8"></script>
    <link rel="icon" type="image/x-icon" href="<c:url value="/image/favicon.ico" />">
</head>
<body>
<div class="container">

    <div class="k-header"><input id="locale" type=""/></div>
    <div class="k-content">
        <div id="imageViewerGrid"></div>
    </div>
    <div class="k-footer">This is Footer</div>
</div>
</body>
</html>
