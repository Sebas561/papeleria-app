<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Consulta de Productos</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { border-collapse: collapse; width: 100%; margin-top: 20px; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
        input[type="text"] { width: 300px; padding: 5px; }
        input[type="submit"] { padding: 5px 10px; }
    </style>
</head>
<body>
    <h2>Buscar producto</h2>
    <form method="post" action="ConsultaServlet">
        <input type="text" name="nombre" placeholder="Nombre del producto" required />
        <input type="submit" value="Buscar" />
    </form>

    <h3>Resultados:</h3>
    <table>
        <tr>
            <th>Nombre</th>
            <th>Precio</th>
            <th>Existencia</th>
        </tr>
        <%= request.getAttribute("resultado") != null ? request.getAttribute("resultado") : "" %>
    </table>
</body>
</html>
