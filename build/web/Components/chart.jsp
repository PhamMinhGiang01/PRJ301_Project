<%-- 
    Document   : chart
    Created on : Mar 21, 2022, 5:35:15 PM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.min.js" integrity="sha512-QSkVNOCYLtj73J4hbmVoOV6KVZuMluZlioC+trLpewV8qMjsWqlIQvkn1KGX2StWvPMdWGBqim1xlC8krl1EKQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.esm.js" integrity="sha512-jUlTTDoq6IvZiinGFQetLcklithBTp8sVUkkUBEYQvYd3hwMuCTd59kAzVpJwvRTmZ2palO++nX+vKC+cK9lqg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.1/chart.js" integrity="sha512-Lii3WMtgA0C0qmmkdCpsG0Gjr6M0ajRyQRQSbTF6BsrVh/nhZdHpVZ76iMIPvQwz1eoXC3DmAg9K51qT5/dEVg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>


    </head>
    <body>
        <div style="width: 50%;height: 50%">
            <canvas id="myChart" width="600" height="500"></canvas>
            <script>
                const ctx = document.getElementById('myChart');
                const myChart = new Chart(ctx, {
                type: 'bar',
                        data: {
                        labels: ['Tháng 1', 'Tháng 2', 'Tháng 3', 'Tháng 4'
                                , 'Tháng 5', 'Tháng 6', 'Tháng 7', 'Tháng 8'
                                , 'Tháng 9', 'Tháng 10', 'Tháng 11', 'Tháng 12'],
                                datasets: [{
                                label: 'Doanh thu tính theo tháng (Triệu VNĐ)',
                                        data: ${sessionScope.listsale},
                                        backgroundColor: [
                                                'rgb(240, 40, 40)'
                                        ]
                                }]
                        },
                        options: {
                        scales: {
                        y: {
                        beginAtZero: true
                        }
                        }
                        }
                });
            </script>

    </body>
</html>
