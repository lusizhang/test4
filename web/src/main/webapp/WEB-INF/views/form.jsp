<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>
<table style="text-align: center;font-size: 30px">
	<tr>
		<th>序号</th>
		<th>学号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>年级</th>
		<th>班级</th>
		<th>学院</th>
		<th>生日</th>
		<th>是否好学生</th>
		<th>修改</th>

	</tr>
	<tr>

		<td>${student.id}</td>
		<td>${student.studentNumber}</td>
		<td>${student.studentName}</td>
		<td>${student.sex}</td>
		<td>${student.grade}</td>
		<td>${student.classNumber}</td>
		<td>${student.college}</td>
		<td>${student.birthday}</td>
		<td>${student.isGoodStudent}</td>
		<td><a href="${website}/edit">修改</a></td>
	</tr>


</table>

</body>
</html>