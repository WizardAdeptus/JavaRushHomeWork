package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

public class ImageReaderFactory
{
   public static ImageReader getReader(ImageTypes types){
       ImageReader reader;
       if(types == ImageTypes.BMP){
           reader= new  BmpReader();
       } else if (types == ImageTypes.JPG){
           reader =  new JpgReader();
       } else if (types == ImageTypes.PNG){
           reader =  new PngReader();
       }else {throw new IllegalArgumentException("Неизвестный тип картинки");}
       return reader;

    }
}
