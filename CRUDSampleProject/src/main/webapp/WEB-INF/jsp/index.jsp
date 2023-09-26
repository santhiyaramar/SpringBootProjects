<h1> Welcome To SpringBoot ${empDetails}</h1>
<form action="/addEmployee">
 Name      :<input type="text" name="name"> </input>
 Employee Id:<input type="text" name="empId"> </input>
<input type="submit">

</form>

<br> <br>
<h2> Search Employee </h2>
<form action="/searchEmployee">

Employee ID  : <input type="text" name="empId"> </input>
<input type="submit">

</form>
<br> <br>

<br> <br>
<h2> Delete Employee </h2>
<form action="/deleteEmployee">
Employee ID  : <input type="text" name="empId"> </input>
<input type="submit">

</form>
<br> <br>
<form action="/updateEmployee">
 Name      :<input type="text" name="name"> </input>
 Employee Id:<input type="text" name="empId"> </input>
<input type="submit">

</form>