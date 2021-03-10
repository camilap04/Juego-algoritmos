
package com.space.modelo;

import java.awt.Image;

public abstract class GameObject implements Cloneable {

    private Image imagem;
    private int x;
    private int y;
    private int altura;
    private int largura;

    private boolean visivel;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int a) {
        this.altura = a;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int l) {

        this.largura = l;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image i) {
        this.imagem = i;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean v) {
        this.visivel = v;
    }

    public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   }
}
