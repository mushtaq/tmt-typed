package tmttyped.std.global

import tmttyped.std.CanvasDirection
import tmttyped.std.CanvasTextAlign
import tmttyped.std.CanvasTextBaseline
import tmttyped.std.ImageSmoothingQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CanvasRenderingContext2D")
@js.native
class CanvasRenderingContext2D ()
  extends StObject
     with tmttyped.std.CanvasRenderingContext2D {
  
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  override var direction: CanvasDirection = js.native
  
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  override var filter: java.lang.String = js.native
  
  /* CompleteClass */
  override var font: java.lang.String = js.native
  
  /* CompleteClass */
  override var globalAlpha: Double = js.native
  
  /* CompleteClass */
  override var globalCompositeOperation: java.lang.String = js.native
  
  /* CompleteClass */
  override var imageSmoothingEnabled: scala.Boolean = js.native
  
  /* CompleteClass */
  override var imageSmoothingQuality: ImageSmoothingQuality = js.native
  
  /* CompleteClass */
  override def restore(): Unit = js.native
  
  /* CompleteClass */
  override def save(): Unit = js.native
  
  /* CompleteClass */
  override var shadowBlur: Double = js.native
  
  /* CompleteClass */
  override var shadowColor: java.lang.String = js.native
  
  /* CompleteClass */
  override var shadowOffsetX: Double = js.native
  
  /* CompleteClass */
  override var shadowOffsetY: Double = js.native
  
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  override var textAlign: CanvasTextAlign = js.native
  
  /* CompleteClass */
  override var textBaseline: CanvasTextBaseline = js.native
}
