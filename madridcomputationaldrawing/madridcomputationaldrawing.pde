void setup(){
  background(255);
  strokeWeight(3);
  size(599,1080);
  strokeCap(PROJECT);
  textAlign(CENTER, CENTER);
  textSize(400);
 
}

void draw(){
  background(5);
  
  fill(150);
  text("MA", 599 / 2, 999 / 6); 
  text("DR", 599 / 2, 999 / 2);  
  text("ID", 599 / 2, 999 * 5 / 6);
  
  fill(200,50,50);
  stroke(250);
  strokeWeight(3);
  beginShape(); //Coa//
  vertex(mouseX+60,mouseY+250);
  vertex(mouseX+60,mouseY+325);
  vertex(mouseX+60,mouseY+400);
  vertex(mouseX+60,mouseY+480);
  vertex(mouseX+60,mouseY+550);
  vertex(mouseX+25,mouseY+585);
  vertex(mouseX-25,mouseY+585);
  vertex(mouseX-60,mouseY+550);
  vertex(mouseX-60,mouseY+480);
  vertex(mouseX-60,mouseY+400);
  vertex(mouseX-60,mouseY+325);
  vertex(mouseX-60,mouseY+250);
  endShape();
  
  beginShape(); 
  vertex(mouseX+60,mouseY+250);
  vertex(mouseX,mouseY+250+25);
  vertex(mouseX-60,mouseY+250);
  endShape();
  beginShape(); 
  vertex(mouseX+60,mouseY+325);
  vertex(mouseX,mouseY+325+22);
  vertex(mouseX-60,mouseY+325);
  endShape();
  beginShape(); 
  vertex(mouseX+60,mouseY+400);
  vertex(mouseX,mouseY+400+18);
  vertex(mouseX-60,mouseY+400);
  endShape();
  beginShape(); 
  vertex(mouseX+60,mouseY+480);
  vertex(mouseX,mouseY+480+15);
  vertex(mouseX-60,mouseY+480);
  endShape();
  beginShape(); 
  vertex(mouseX+60,mouseY+550);
  vertex(mouseX,mouseY+550+10);
  vertex(mouseX-60,mouseY+550);
  endShape();  
  
  
  fill(75,50,50);
  beginShape(); //Pectorals//
  vertex(mouseX,mouseY);
  vertex(mouseX+78,mouseY+16);
  vertex(mouseX+108,mouseY-13);
  vertex(mouseX+78,mouseY-108);
  vertex(mouseX,mouseY-86);
  vertex(mouseX,mouseY);
  endShape();
  beginShape();
  vertex(mouseX,mouseY);
  vertex(mouseX-78,mouseY+16);
  vertex(mouseX-108,mouseY-13);
  vertex(mouseX-78,mouseY-108);
  vertex(mouseX,mouseY-86);
  vertex(mouseX,mouseY);
  endShape();
  
  fill(100);
  beginShape();//Abdominals//
   vertex(mouseX,mouseY);
   vertex(mouseX+78,mouseY+16);
   vertex(mouseX+82,mouseY+50);
   vertex(mouseX+66,mouseY+68);
   vertex(mouseX,mouseY+53);
   vertex(mouseX,mouseY);
  endShape();
    beginShape();
   vertex(mouseX,mouseY);
   vertex(mouseX-78,mouseY+16);
   vertex(mouseX-82,mouseY+50);
   vertex(mouseX-66,mouseY+68);
   vertex(mouseX,mouseY+53);
   vertex(mouseX,mouseY);
  endShape();
  beginShape();
  vertex(mouseX,mouseY+53);
  vertex(mouseX-66,mouseY+68);
  vertex(mouseX-46,mouseY+119);
  vertex(mouseX,mouseY+102);
  vertex(mouseX,mouseY+53);
  endShape();
   beginShape();
  vertex(mouseX,mouseY+53);
  vertex(mouseX+66,mouseY+68);
  vertex(mouseX+46,mouseY+119);
  vertex(mouseX,mouseY+102);
  vertex(mouseX,mouseY+53);
  endShape();
  
  beginShape(); //Abdominal central//
  vertex(mouseX,mouseY+102);
  vertex(mouseX+48,mouseY+102+13);
  vertex(mouseX+36,mouseY+102+60);
  vertex(mouseX+18,mouseY+102+70);
  vertex(mouseX-18,mouseY+102+70);
  vertex(mouseX-36,mouseY+102+60);
  vertex(mouseX-48,mouseY+102+13);
  vertex(mouseX,mouseY+102);
  endShape();
  
  beginShape(); //Cintura//
  vertex(mouseX,mouseY+259);
  vertex(mouseX+46,mouseY+259-78);
  vertex(mouseX+36,mouseY+102+60);
  vertex(mouseX+18,mouseY+102+70);
  vertex(mouseX-18,mouseY+102+70);
  vertex(mouseX-36,mouseY+102+60);
  vertex(mouseX-46,mouseY+259-78);
  vertex(mouseX,mouseY+259);
  endShape();
  
  fill(60,40,40);
  beginShape(); //Costats//
  vertex(mouseX+48,mouseY+102+13);
  vertex(mouseX+36,mouseY+102+60);
  vertex(mouseX+46,mouseY+259-78);
  vertex(mouseX+70,mouseY+160);
  vertex(mouseX+78,mouseY+122);
  vertex(mouseX+48,mouseY+102+13);
  vertex(mouseX+66,mouseY+68);
  vertex(mouseX+82,mouseY+50);
  vertex(mouseX+103,mouseY+84);
  vertex(mouseX+78,mouseY+122);
  endShape();
  beginShape(); 
  vertex(mouseX-48,mouseY+102+13);
  vertex(mouseX-36,mouseY+102+60);
  vertex(mouseX-46,mouseY+259-78);
  vertex(mouseX-70,mouseY+160);
  vertex(mouseX-78,mouseY+122);
  vertex(mouseX-48,mouseY+102+13);
  vertex(mouseX-66,mouseY+68);
  vertex(mouseX-82,mouseY+50);
  vertex(mouseX-103,mouseY+84);
  vertex(mouseX-78,mouseY+122);
  endShape();
  
  
  beginShape();//Avantbraç//
  vertex(mouseX+108,mouseY-13);
  vertex(mouseX+78,mouseY-108);
  vertex(mouseX+85,mouseY-115);
  vertex(mouseX+150,mouseY-90);
  vertex(mouseX+180,mouseY-8);
  vertex(mouseX+160,mouseY+6);
  vertex(mouseX+108,mouseY-13);
  vertex(mouseX+78,mouseY+16);
  vertex(mouseX+82,mouseY+50);
  vertex(mouseX+103,mouseY+84);
  vertex(mouseX+160,mouseY+115);
  vertex(mouseX+190,mouseY+50);
  vertex(mouseX+180,mouseY-8);
  vertex(mouseX+160,mouseY+6);
  endShape();
  beginShape();
  vertex(mouseX-108,mouseY-13);
  vertex(mouseX-78,mouseY-108);
  vertex(mouseX-85,mouseY-115);
  vertex(mouseX-150,mouseY-90);
  vertex(mouseX-180,mouseY-8);
  vertex(mouseX-160,mouseY+6);
  vertex(mouseX-108,mouseY-13);
  vertex(mouseX-78,mouseY+16);
  vertex(mouseX-82,mouseY+50);
  vertex(mouseX-103,mouseY+84);
  vertex(mouseX-160,mouseY+115);
  vertex(mouseX-190,mouseY+50);
  vertex(mouseX-180,mouseY-8);
  vertex(mouseX-160,mouseY+6);
  endShape();
  
  fill(75,50,50);
  beginShape();//Braç//
  vertex(mouseX+103,mouseY+84);
  vertex(mouseX+160,mouseY+115);
  vertex(mouseX+103,mouseY+84);
  vertex(mouseX+103,mouseY+84);
  vertex(mouseX+112,mouseY+133);
  vertex(mouseX+137,mouseY+189);
  vertex(mouseX+197,mouseY+222);
  vertex(mouseX+222,mouseY+99);
  vertex(mouseX+190,mouseY+50);
  vertex(mouseX+160,mouseY+115);
  endShape();
  beginShape();
  vertex(mouseX-103,mouseY+84);
  vertex(mouseX-160,mouseY+115);
  vertex(mouseX-103,mouseY+84);
  vertex(mouseX-103,mouseY+84);
  vertex(mouseX-112,mouseY+133);
  vertex(mouseX-137,mouseY+189);
  vertex(mouseX-197,mouseY+222);
  vertex(mouseX-222,mouseY+99);
  vertex(mouseX-190,mouseY+50);
  vertex(mouseX-160,mouseY+115);
  endShape();
  
  fill(100);
  quad(mouseX+137,mouseY+189,mouseX+197,mouseY+222,mouseX+195,mouseY+232,mouseX+128,mouseY+192);
  quad(mouseX-137,mouseY+189,mouseX-197,mouseY+222,mouseX-195,mouseY+232,mouseX-128,mouseY+192);
  
  fill(75,50,50);
  beginShape();//Bessons//
  vertex(mouseX+72,mouseY+147);
  vertex(mouseX+72+44,mouseY+147+55);
  vertex(mouseX+72+44+21,mouseY+147+55+130);
  vertex(mouseX+72+44+15,mouseY+147+55+148);
  vertex(mouseX+72,mouseY+147+55+148+17);
  vertex(mouseX+20,mouseY+147+11+148);
  vertex(mouseX+5,mouseY+254);
  vertex(mouseX+46,mouseY+259-78);
  vertex(mouseX+70,mouseY+160);
  vertex(mouseX+72,mouseY+147);
  endShape();
  beginShape();
  vertex(mouseX-72,mouseY+147);
  vertex(mouseX-72-44,mouseY+147+55);
  vertex(mouseX-72-44-21,mouseY+147+55+130);
  vertex(mouseX-72-44-15,mouseY+147+55+148);
  vertex(mouseX-72,mouseY+147+55+148+17);
  vertex(mouseX-20,mouseY+147+11+148);
  vertex(mouseX-5,mouseY+254);
  vertex(mouseX-46,mouseY+259-78);
  vertex(mouseX-70,mouseY+160);
  vertex(mouseX-72,mouseY+147);
  endShape();
  
  fill(100,50,50);
  beginShape();//Cama//
  vertex(mouseX+72+44+15,mouseY+147+55+148);
  vertex(mouseX+72,mouseY+147+55+148+17);
  vertex(mouseX+20,mouseY+147+11+148);
  vertex(mouseX+47,mouseY+147+55+148+17+220);
  vertex(mouseX+62,mouseY+147+55+148+32+220);
  vertex(mouseX+92+55-30,mouseY+147+55+140+32+220);
  vertex(mouseX+72+44+15,mouseY+147+55+148);
  endShape();
  beginShape();//Cama//
  vertex(mouseX-72-44-15,mouseY+147+55+148);
  vertex(mouseX-72,mouseY+147+55+148+17);
  vertex(mouseX-20,mouseY+147+11+148);
  vertex(mouseX-47,mouseY+147+55+148+17+220);
  vertex(mouseX-62,mouseY+147+55+148+32+220);
  vertex(mouseX-92-55+30,mouseY+147+55+140+32+220);
  vertex(mouseX-72-44-15,mouseY+147+55+148);
  endShape();
  
  fill(170,60,60);
  //Ròtules//
  quad(mouseX+142,mouseY+359,mouseX+103,mouseY+338,mouseX+63,mouseY+368,mouseX+113,mouseY+396);
  quad(mouseX-142,mouseY+359,mouseX-103,mouseY+338,mouseX-63,mouseY+368,mouseX-113,mouseY+396);
  
  
  //Mans//
  fill(35,20,20);
  beginShape();
  vertex(mouseX+128,mouseY+192);
  vertex(mouseX+195,mouseY+232);
  vertex(mouseX+197-33,mouseY+222+57);
  vertex(mouseX+111+28,mouseY+270+22);
  vertex(mouseX+197-33-56,mouseY+222+57);
  vertex(mouseX+128-15,mouseY+192+11);
  vertex(mouseX+128,mouseY+192);
  endShape();
  
  
  fill(35,20,20);
  beginShape();
  vertex(mouseX-128,mouseY+192);
  vertex(mouseX-195,mouseY+232);
  vertex(mouseX-197+33,mouseY+222+57);
  vertex(mouseX-111-28,mouseY+270+22);
  vertex(mouseX-197+33+56,mouseY+222+57);
  vertex(mouseX-128+15,mouseY+192+11);
  vertex(mouseX-128,mouseY+192);
  endShape();
  
  //Dits//
  fill(120,10,40);
  beginShape();
  vertex(mouseX+86,mouseY+227);
  vertex(mouseX+86,mouseY+241);
  vertex(mouseX+106,mouseY+247);
  vertex(mouseX+123,mouseY+241);
  vertex(mouseX+113,mouseY+203);
  vertex(mouseX+86,mouseY+227);
  endShape();
  beginShape();
  vertex(mouseX-86,mouseY+227);
  vertex(mouseX-86,mouseY+241);
  vertex(mouseX-106,mouseY+247);
  vertex(mouseX-123,mouseY+241);
  vertex(mouseX-113,mouseY+203);
  vertex(mouseX-86,mouseY+227);
  endShape();
  beginShape();
   vertex(mouseX+111,mouseY+270);
   vertex(mouseX+111+28,mouseY+270+22);
   vertex(mouseX+111+10,mouseY+270+37);
   vertex(mouseX+104,mouseY+270+27);
   vertex(mouseX+111,mouseY+270);
  endShape();
  beginShape();
   vertex(mouseX-111,mouseY+270);
   vertex(mouseX-111-28,mouseY+270+22);
   vertex(mouseX-111-10,mouseY+270+37);
   vertex(mouseX-104,mouseY+270+27);
   vertex(mouseX-111,mouseY+270);
  endShape();
  beginShape();
  vertex(mouseX+197-33,mouseY+222+57);
  vertex(mouseX+111+28,mouseY+270+22);
  vertex(mouseX+197-33-40,mouseY+222+57+24);
  vertex(mouseX+197-33-18,mouseY+222+57+28);
  vertex(mouseX+197-33,mouseY+222+57);
  endShape();
  beginShape();
  vertex(mouseX-197+33,mouseY+222+57);
  vertex(mouseX-111-28,mouseY+270+22);
  vertex(mouseX-197+33+40,mouseY+222+57+24);
  vertex(mouseX-197+33+18,mouseY+222+57+28);
  vertex(mouseX-197+33,mouseY+222+57);
  endShape();
  
  
  //Falanges//
  fill(200,0,0);
  beginShape();
  vertex(mouseX+86,mouseY+241);
  vertex(mouseX+106,mouseY+247);
  vertex(mouseX+123,mouseY+241);
  vertex(mouseX+86+25,mouseY+270);
  vertex(mouseX+92,mouseY+281);
  vertex(mouseX+86-10,mouseY+271);
  vertex(mouseX+86,mouseY+241);
  endShape();
  beginShape();
  vertex(mouseX-86,mouseY+241);
  vertex(mouseX-106,mouseY+247);
  vertex(mouseX-123,mouseY+241);
  vertex(mouseX-86-25,mouseY+270);
  vertex(mouseX-92,mouseY+281);
  vertex(mouseX-76,mouseY+271);
  vertex(mouseX-86,mouseY+241);
  endShape();
  beginShape();
  vertex(mouseX+111+10,mouseY+270+37);
  vertex(mouseX+111+10-32,mouseY+270+37+16);
  vertex(mouseX+111+10-40,mouseY+270+37+2);
  vertex(mouseX+111+10-30,mouseY+270+37-20);
  vertex(mouseX+111+10-15,mouseY+270+37-23);
  vertex(mouseX+111+10,mouseY+270+37);
  endShape();
  beginShape();
  vertex(mouseX-111-10,mouseY+270+37);
  vertex(mouseX-111-10+32,mouseY+270+37+16);
  vertex(mouseX-111-10+40,mouseY+270+37+2);
  vertex(mouseX-111-10+30,mouseY+270+37-20);
  vertex(mouseX-111-10+15,mouseY+270+37-23);
  vertex(mouseX-111-10,mouseY+270+37);
  endShape();
  beginShape();
  vertex(mouseX+121+28,mouseY+290+22-5);
  vertex(mouseX+121+28-36,mouseY+290+22+4-5);
  vertex(mouseX+121+28-19,mouseY+290+22-7-5);
  vertex(mouseX+121+28,mouseY+290+22-5);
  endShape();
  beginShape();
  vertex(mouseX-121-28,mouseY+290+22-5);
  vertex(mouseX-121-28+36,mouseY+290+22+4-5);
  vertex(mouseX-121-28+19,mouseY+290+22-7-5);
  vertex(mouseX-121-28,mouseY+290+22-5);
  endShape();
  
  //Peus//
  fill(175,25,25);
  
  
  
  beginShape();
  vertex(mouseX+91,mouseY+600);
  vertex(mouseX+91+45,mouseY+592+5);
  vertex(mouseX+91+95,mouseY+592+15);
  vertex(mouseX+91+100,mouseY+592+65);
  vertex(mouseX+110,mouseY+592+70);
  vertex(mouseX+91,mouseY+600);
  endShape();
  beginShape();
  vertex(mouseX+91,mouseY+600);
  vertex(mouseX+47+70,mouseY+147+55+148+17+220+35);
  vertex(mouseX+47+60,mouseY+147+55+148+17+220+75);
  vertex(mouseX+91+75,mouseY+592+70);
  vertex(mouseX+91+70,mouseY+592+20);
  vertex(mouseX+91+25,mouseY+592-5);
  vertex(mouseX+91,mouseY+600);
  endShape();
  beginShape();
  vertex(mouseX+47,mouseY+147+55+148+17+220);
  vertex(mouseX+62,mouseY+147+55+148+32+220);
  vertex(mouseX+47+44,mouseY+147+55+148+22+220);
  vertex(mouseX+47+70,mouseY+147+55+148+17+220+35);
  vertex(mouseX+47+60,mouseY+147+55+148+17+220+75);
  vertex(mouseX+47-8,mouseY+147+55+148+17+220+67);
  vertex(mouseX+47-15,mouseY+147+55+148+17+220+45);
  vertex(mouseX+47,mouseY+147+55+148+17+220);
  endShape();
 
 beginShape();
  vertex(mouseX-91,mouseY+600);
  vertex(mouseX-91-45,mouseY+592+5);
  vertex(mouseX-91-95,mouseY+592+15);
  vertex(mouseX-91-100,mouseY+592+65);
  vertex(mouseX-110,mouseY+592+70);
  vertex(mouseX-91,mouseY+600);
  endShape();
  beginShape();
  vertex(mouseX-91,mouseY+600);
  vertex(mouseX-47-70,mouseY+147+55+148+17+220+35);
  vertex(mouseX-47-60,mouseY+147+55+148+17+220+75);
  vertex(mouseX-91-75,mouseY+592+70);
  vertex(mouseX-91-70,mouseY+592+20);
  vertex(mouseX-91-25,mouseY+592-5);
  vertex(mouseX-91,mouseY+600);
  endShape();
  beginShape();
  vertex(mouseX-47,mouseY+147+55+148+17+220);
  vertex(mouseX-62,mouseY+147+55+148+32+220);
  vertex(mouseX-47-44,mouseY+147+55+148+22+220);
  vertex(mouseX-47-70,mouseY+147+55+148+17+220+35);
  vertex(mouseX-47-60,mouseY+147+55+148+17+220+75);
  vertex(mouseX-47+8,mouseY+147+55+148+17+220+67);
  vertex(mouseX-47+15,mouseY+147+55+148+17+220+45);
  vertex(mouseX-47,mouseY+147+55+148+17+220);
  endShape();
  
  
  //Coll//
  fill(60,40,40);
  beginShape();
  vertex(mouseX,mouseY-87);
  vertex(mouseX+80,mouseY-87-22);
  vertex(mouseX+87,mouseY-87-30);
  vertex(mouseX+65,mouseY-87-45);
  vertex(mouseX+50,mouseY-87-65);
  vertex(mouseX+40,mouseY-87-95);
  vertex(mouseX-40,mouseY-87-95);
  vertex(mouseX-50,mouseY-87-65);
  vertex(mouseX-65,mouseY-87-45);
  vertex(mouseX-87,mouseY-87-30);
  vertex(mouseX-80,mouseY-87-22);
  vertex(mouseX,mouseY-87);
  endShape();
  
  fill(200,0,0);
  
  beginShape();
  vertex(mouseX,mouseY-87);
  vertex(mouseX+16,mouseY-87-5);
  vertex(mouseX+25,mouseY-87-30);
  vertex(mouseX+25,mouseY-87-55);
  vertex(mouseX+20,mouseY-87-95);
  vertex(mouseX-20,mouseY-87-95);
  vertex(mouseX-25,mouseY-87-55);
  vertex(mouseX-25,mouseY-87-30);
  vertex(mouseX-16,mouseY-87-5);
  vertex(mouseX,mouseY-87);
  endShape();
  
  noFill();
  beginShape();
  vertex(mouseX+80,mouseY-87-22);
  vertex(mouseX,mouseY-87-22+10);
  vertex(mouseX-80,mouseY-87-22);
  endShape();
  beginShape();
  vertex(mouseX+87,mouseY-87-30);
  vertex(mouseX,mouseY-87-30-20);
  vertex(mouseX-87,mouseY-87-30);
  endShape();
  beginShape();
  vertex(mouseX+65,mouseY-87-45);
  vertex(mouseX,mouseY-87-45-40);
  vertex(mouseX-65,mouseY-87-45);
  endShape();
  
//Antenes//

  fill(200,0,0);
 beginShape();
 vertex(mouseX+60,mouseY-285-65);
 vertex(mouseX+75,mouseY-285-55);
 vertex(mouseX+48,mouseY-285+38);
 vertex(mouseX+42,mouseY-285+14);
 vertex(mouseX+60,mouseY-285-65);
 endShape();
 beginShape();
 vertex(mouseX-60,mouseY-285-65);
 vertex(mouseX-75,mouseY-285-55);
 vertex(mouseX-48,mouseY-285+38);
 vertex(mouseX-42,mouseY-285+14);
 vertex(mouseX-60,mouseY-285-65);
 endShape();
 
 fill (80,80,80);
 beginShape();
 vertex(mouseX+60,mouseY-285-65);
 vertex(mouseX+42,mouseY-285+14);
 vertex(mouseX+25,mouseY-285+10);
 vertex(mouseX+60,mouseY-285-65);
 endShape();
 beginShape();
 vertex(mouseX-60,mouseY-285-65);
 vertex(mouseX-42,mouseY-285+14);
 vertex(mouseX-25,mouseY-285+10);
 vertex(mouseX-60,mouseY-285-65);
 endShape();
 
 //Mandíbula//
 
 fill (80,80,80);
 beginShape();
 vertex(mouseX+55,mouseY-285+80);
 vertex(mouseX+36,mouseY-285+125);
 vertex(mouseX,mouseY-285+135);
 vertex(mouseX-36,mouseY-285+125);
 vertex(mouseX-55,mouseY-285+80);
 endShape();
 
 //Cap//
 
 fill (65,65,65);
 beginShape();
 vertex(mouseX,mouseY-285);
 vertex(mouseX+42,mouseY-285+14);
 vertex(mouseX+55,mouseY-285+80);
 vertex(mouseX+46,mouseY-185);
 vertex(mouseX+37,mouseY-285+103);
 vertex(mouseX+32,mouseY-285+121);
 vertex(mouseX+27,mouseY-285+107);
 vertex(mouseX,mouseY-285+102);
 vertex(mouseX-27,mouseY-285+107);
 vertex(mouseX-32,mouseY-285+121);
 vertex(mouseX-37,mouseY-285+103);
 vertex(mouseX-46,mouseY-185);
 vertex(mouseX-55,mouseY-285+80);
 vertex(mouseX-42,mouseY-285+14);
 vertex(mouseX,mouseY-285);
 endShape();
 
 //Visor//
 
 fill(0,0,0);
 beginShape();
 vertex(mouseX,mouseY-285+13);
 vertex(mouseX+35,mouseY-285+25);
 vertex(mouseX+43,mouseY-285+60);
 vertex(mouseX+37,mouseY-285+67);
 vertex(mouseX+25,mouseY-285+60);
 vertex(mouseX-25,mouseY-285+60);
 vertex(mouseX-37,mouseY-285+67);
 vertex(mouseX-43,mouseY-285+60);
 vertex(mouseX-35,mouseY-285+25);
 vertex(mouseX,mouseY-285+13);
 endShape();

//Ulls i foses nasals//

strokeWeight(12);
stroke(220,10,10);

point (mouseX+10,mouseY-252);
point (mouseX-10,mouseY-252);

strokeWeight(10);
point (mouseX+25,mouseY-245);
point (mouseX-25,mouseY-245);
point (mouseX, mouseY-236);

strokeWeight(8);
point (mouseX + 15, mouseY-232);
point (mouseX - 15, mouseY-232);

strokeCap(ROUND);
strokeWeight(4);
stroke(20,20,20);
point (mouseX+25, mouseY-285+90);
point (mouseX+30, mouseY-285+98);
point (mouseX+20, mouseY-285+98);
point (mouseX-25, mouseY-285+90);
point (mouseX-30, mouseY-285+98);
point (mouseX-20, mouseY-285+98);

}
