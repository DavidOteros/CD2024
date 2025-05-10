# Refactoring

This is an exercise designed to practice the skill of detecting 
Code Smells and refactoring the code to fix the problems. 
Solution is also included.

Code Smells covered:

1. Long method: 
   - Na clase GameEngine, antes tiñamos o método resetboard, para resetar o taboleiro o cal crea un método moi longo e dificl de seguir, na nova clase refactorizada pasamos de ter un método subdividilo en mais métodos.
2. Duplicate code within class:
   - Na clase ChessBoard, utiliza no método getPiece a lóxica que xa se econtraba no método isEmpty. Duplica a lóxica booleana, agora utiliza o método isEmpty(position) para non repetir a mesma lóxica.
3. Duplicate code within method:
   - Na clase GameEngina, iñamos o método resetboard o cal era moi longo e ademáis duplicaba código, agora como dixemos antes o código esta subdividido e non repite o mesmo todo o rato para levar a cabo o reset
4. Duplicate code across classes: 
   - Método "Straightline movement" duplicado en ChessBoard y MoveUtil. Se da cando dúas clases ou máis teñen códigos moi parecidos ou idénticos.
5. Magic Number: 
   - Na clase "ChessBoard", cambiando os números máxicos por 8 e facendo unha constante desta maneira facilita cambiar valores no código de forma mais cómoda e favorece o mantemento.
6. Feature Envy (2 instances): O método accede mais ao datos de outra clase mais que a os seus propios.
   - Atributo _kinDead declarado privado e geatboard removido
   - A clase GameEngine accede directamente a os datos internos de Chessboard para facer a tarefa de reset board, agora ca refactorización movese a lóxica de inicializar o tablero ao método resetboard() dentro da clase Chessboard
7. Improper Naming:
   - Na clase Player, cambiase o nome por un moito mais claro, antes tiñamos increase que era un nome un pouco ambiguo para unha persoa axea ao código, agora temos incrementGamesWon, un nome moito máis descriptivo
8. Dead Code: 
   - En la clase Chessboard, se eliminan los atributos player1 y 2, el getPlayerName, printMove y toString en Position. Basicamente estamos limpando código que está obsoleto ou do que non se está facendo uso 
9. Lazy Class: 
   - Agora cada clase implementa o seu propio método de movemento, antes utilizabase un switch na clase superior para os movementos o cal non tiña sentido, pódese visualizar esto na clase bishop. 
10. Switch Case: 
    - Crea un método abstracto na clase piece para que os fillos hereden o seu propio movemento.
11. Indecent Exposure: 
    - Na clase piece, antes os atributos eran públicos o cal non ten sentido, non se debe de poder acceder a os atributos directamente, agora no código refactorizado 
12. Collapse Hierarchy (Lazy Class):
    - Estableceuse unha xerarquía de clases, para que cada clase fixa herede os seus métodos 
13. Long Parameter List: 
    - Na clase ChessBoard, no método isValidMove antes estaba pasando un montón de datos en vez de pasar directamente as clases que xa conteñen os datos necesarios. Agora emplea a propia clase no método isValidMove en vez de pasar os atributos.


sudo update-java-alternatives
sudo update-java-alternatives -l

java -version

sudo update-alternatives --confic java
sudo update-alternatives --confic javac

Necesitamos la version 8 


mvn clean test 

