import static java.awt.RenderingHints.*
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

def img = ImageIO.read( new File( '/tmp/image.png' ) )

def scale = 0.5

int newWidth = img.width * scale
int newHeight = img.height * scale

new BufferedImage( newWidth, newHeight, img.type ).with { i ->
  createGraphics().with {
    setRenderingHint( KEY_INTERPOLATION, VALUE_INTERPOLATION_BICUBIC )
    drawImage( img, 0, 0, newWidth, newHeight, null )
    dispose()
  }
  ImageIO.write( i, 'png', new File( '/tmp/scaled.png' ) )
}
