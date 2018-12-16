const image = new SimpleImage('image.jpg');

const thirds = image.getWidth() / 3;

  for(const pixel of image.values()){
      const x = pixel.getX();
      if(x < third) {
          pixel.setRed(255);
      } else if(x > third && x < third + third) {
          pixel.setGreen(255);
      } else {
          pixel.setBlue(255);
      }
  }

  print(image);

/* Part 2 */

function swapRedGreen(img) {
  for(const px of img.value()) {
      const red = px.getRed();
      const green = px.getGreen();

      px.setGreen(red);
      px.setRed(green);
  }

  img setSize(200,200);
  print(img);
}

  const img = new SimpleImage('random2.jpg');
  swapRedGreen(img);



/* Part 3 */
const devil = new SimpleImage('duke_blue_devil.png');

for(const pix of devil.values()) {
    if(pix.getRed() + pix.getGreen() + pix.getBlue() < 765) {
        pix.setRed(255);
        pix.setGreen(255);
        pix.setBlue(0);
    }
}

print(devil);