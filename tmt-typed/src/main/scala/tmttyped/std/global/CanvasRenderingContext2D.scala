package tmttyped.std.global

import tmttyped.std.CanvasDirection
import tmttyped.std.CanvasTextAlign
import tmttyped.std.CanvasTextBaseline
import tmttyped.std.GlobalCompositeOperation
import tmttyped.std.ImageSmoothingQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CanvasRenderingContext2D")
@js.native
/* standard DOM */
open class CanvasRenderingContext2D ()
  extends StObject
     with tmttyped.std.CanvasRenderingContext2D {
  
  /* standard DOM */
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var direction: CanvasDirection = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var filter: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var font: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var globalAlpha: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var globalCompositeOperation: GlobalCompositeOperation = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var imageSmoothingEnabled: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var imageSmoothingQuality: ImageSmoothingQuality = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def restore(): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def save(): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var shadowBlur: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var shadowColor: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var shadowOffsetX: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var shadowOffsetY: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var textAlign: CanvasTextAlign = js.native
  
  /* standard DOM */
  /* CompleteClass */
  var textBaseline: CanvasTextBaseline = js.native
}
