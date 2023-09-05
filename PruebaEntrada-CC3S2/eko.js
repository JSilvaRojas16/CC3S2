/* Ejecicio 6 (Eko) - Datos del alumno: JUAN SEBASTIAN SILVA ROJAS - 20200579G*/
const resolution = () => {
  let numberTrees = prompt("Number of trees: ")
  let amountWood = prompt("Wood amount: ")
  let heightTrees = []
  let condition = checkValidValue(numberTrees,1,1000000) && checkValidValue(amountWood,1,2000000000)
  
  /*Piendo los datos de las alturas de los arboles */
  if (condition){
    for (let i=0;i<numberTrees;i++) {
      let aux = prompt("height: ")
      if(checkValidValue(aux,1,1000000000)) {heightTrees.push(aux)} 
    }
  } else alert("there's an invalid value")  
  
  /* Mostrando los inputs en consola: */
  console.log("Trees: ",numberTrees)
  console.log("Amount Trees: ",amountWood)
  console.log("Height of trees: [", heightTrees.join(" "),"]")

  /*Hallando la altura requerida para el ouput*/
  let sum = 0
  for (let i = Math.max(...heightTrees); i>= Math.min(...heightTrees) ; i--) {
    heightTrees.forEach((height)=>{
      if(height-i>0) sum = sum + (height-i) 
    })

    if(sum == amountWood) return i
    
    sum = 0
  }
}

const checkValidValue = (value,low,up) => {
  if(value>= low && value<=up) {return true}

  return false
}

console.log("Required height: ",resolution())