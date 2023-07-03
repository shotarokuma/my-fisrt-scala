val salaries = Seq(20_000, 70_000, 40_000)
val doubleSalary = (x: Int) => x * 2
val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)

val salaries = Seq(20_000, 70_000, 40_000)
val newSalaries = salaries.map(_ * 2)