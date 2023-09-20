// Declaramos as variáveis que vamos usar
let nota1, nota2, nota3, nota4;
let media;

// Lemos as notas do aluno
nota1 = prompt("Digite a primeira nota:");
nota2 = prompt("Digite a segunda nota:");
nota3 = prompt("Digite a terceira nota:");
nota4 = prompt("Digite a quarta nota:");

// Calculamos a média das notas
media = (nota1 + nota2 + nota3 + nota4) / 4;

// Imprimimos a média do aluno
console.log("A média do aluno é:", media);

// Verificamos se o aluno está aprovado, de recuperação ou reprovado
if (media >= 7) {
  console.log("O aluno está aprovado.");
} else if (media >= 5) {
  console.log("O aluno está de recuperação.");
} else {
  console.log("O aluno está reprovado.");
}
