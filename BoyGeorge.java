package BoyGeorge;
import robocode.*;
import java.awt.Color;
public class BoyGeorge extends AdvancedRobot 
{
	//Fabiana Quelott Lopes Cançado - 119214091		
	//Lucas Vilas Boas Lage - 119119592	
	//Mariana Santos Abreu - 119122204
	//Eve Clair Ulrik Pavie - 119122204
    //Fernando Lucas Souza Lopes - 119124309



	public void run() {
		setBodyColor(new Color(0, 0, 0)); //Cor do corpo do robô (Preto, preto, preto)
        setGunColor(new Color(0, 0, 0)); //Cor da arma do robô (Preto, preto, preto)
        setRadarColor(new Color(0, 0, 0)); //Cor do radar do robô (Preto, preto, preto)
        setBulletColor(new Color(0, 0, 0)); //Cor da bala do robô(Preto, preto, preto)
        setScanColor(new Color(0, 255, 0)); //Cor do scan do robô (Preto, verde, preto)


		while(true) {
			setAhead(100); //Anda 100 pixels para frente
			setTurnLeft(90); //Gira 90 graus para esquerda
			setTurnGunRight(90); //Gira 90 graus para direita
			execute(); //Excecuta os métodos 
			//Enquanto for verdade, o robô executa os comandos
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(2); //Quando o robô escaneia o outro, atira com a potência 2 (Potência referência quanto de vida	
		//irá tirar do robô para atirar
	}

	public void onHitByBullet(HitByBulletEvent e) {
		ahead(50); //Anda 50 pixels para frente
		setTurnLeft(90); //Gira 90 graus para esquerda
		//Quando robô é acertado por um tiro
	}
	
	public void onHitWall(HitWallEvent e) {
		ahead(50); //Anda 50 pixels para frente
		setTurnLeft(90); //Gira 90 graus para esquerda
		//Quando robô bate na parede
	}
	public void onWin(WinEvent e) {
		for (int i = 0; i < 50; i++) {
			turnRight(30); //Gira 30 graus para direita
			turnLeft(30); //Gira 30 graus para esquerda
			//Robo gira quando vence a batalha
		}
	}	
	
 
}

	
