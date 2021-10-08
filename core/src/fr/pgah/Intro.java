package fr.pgah;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Intro extends ApplicationAdapter {
  SpriteBatch batch;
  Texture [] imgs;
  int [] coordonneesX; 
  int [] coordonneesY;
  int [] hauteurImgs;//tableau d'entier
  int x;
  int x2;
  int y;
  int y2;
  int hauteurFenetre;
   // 0 pour monter et 1 pour descendre
  boolean[] montent;

  @Override
  public void create() {
    batch = new SpriteBatch();
    //img = new Texture("sio.jpg");
    imgs= new Texture[2]; //créer un tableau de texture
    imgs[0] = new Texture("sio.jpg");
    imgs[1] = new Texture("sio.jpg"); //il ira dans la deuxième case vu qu'un tableau de type objet commence par 0
    
    coordonneesX = new int[2];
    coordonneesX[0] = 0;
    coordonneesX[1]= 100;

    coordonneesY = new int[40];
    coordonneesY[0] = 0;
    coordonneesY[1] = 12;
    coordonneesY[2] = 25;

    hauteurImgs = new int[5];
    hauteurImgs[0] = imgs[0].getHeight();
    hauteurImgs[1] = imgs[1].getHeight(); //pour copier shift + alt avec les fleches de haut ou bas

    montent = new boolean[1];
    montent[0] = true;
    montent[1] = false;



   // hauteurFenetre = Gdx.graphics.getHeight();
    //hauteurImg = img.getHeight();
    ;
  }

  @Override
  public void render() {
    
    reinitialiserBackround();//appel de méthode: je dois executer ce code
    testerBordures();
    majCoordonnees();
    //dessiner
    dessiner();
      }

    private void dessiner () {
        batch.begin(); //begin :méthode
        batch.draw(imgs, x, y);
        batch.end();
      }

      private void testerBordures(){  // rebond bordure supérieure    
        for (int i = 0; i < coordonneesX.length; i++) {
          if (coordonneesY[i] + hauteurImgs[i]== hauteurFenetre){
            montent[i] = false;
          }
          //tester bordures basse
        if (coordonneesY[i] == 0) {
          montent [i] = true;
        }
      }
        
     }    

     private void majCoordonnees() {
       for (int i = 0; i <= 1 coordonneesX.length; i++) {
         coordonneesX[i] = coordonneesX[i] + 1,
       }
       for (int j = 0; j < coordonneesX.length; j++) {
         if 
         
       }

   }
    public void reinitialiserBackround (){
      ScreenUtils.clear(1,0,0,1);
    }

  }

  //Texture imgs [] = tableau de texture, ts les tableaux sont des types objets.
  //imgs = plusieurs img 
  //Texture imgs[] imgs;
  //new = instanciation
  //type img un []tableau de Texture
  //toute les cases de Texture seront de manière continue en mémoire
  // Texture img [2] 2= nombre de casses