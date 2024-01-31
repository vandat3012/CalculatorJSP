<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Calculator</h1>
    <form method="post" action="/calculator">
        <fieldset>
            <legend>Calculator</legend>
            <table>
                <tr>
                    <td>First Number </td>
                    <td><input name="first" type="text" placeholder="Enter first number"/></td>
                </tr>
                <tr>
                    <td>Operator: </td>
                    <td>
                        <select name="calculator">
                            <option value="+">Addition</option>
                            <option value="-">Subtraction</option>
                            <option value="*">Multiplication</option>
                            <option value="/">Division</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Second operand: </td>
                    <td><input name="second" type="text" placeholder="Enter second number"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Calculate"/></td>
                </tr>
            </table>
        </fieldset>
</form>
</body>
</html>