package tmttyped.std.global

import tmttyped.std.ImageDataSettings
import tmttyped.std.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ImageData")
@js.native
open class ImageData protected ()
  extends StObject
     with tmttyped.std.ImageData {
  /* standard DOM */
  def this(data: js.typedarray.Uint8ClampedArray, sw: Double) = this()
  /* standard DOM */
  def this(sw: Double, sh: Double) = this()
  def this(data: js.typedarray.Uint8ClampedArray, sw: Double, sh: Double) = this()
  def this(sw: Double, sh: Double, settings: ImageDataSettings) = this()
  def this(data: js.typedarray.Uint8ClampedArray, sw: Double, sh: Double, settings: ImageDataSettings) = this()
  def this(data: js.typedarray.Uint8ClampedArray, sw: Double, sh: Unit, settings: ImageDataSettings) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override val colorSpace: PredefinedColorSpace = js.native
  
  /** Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255. */
  /* standard DOM */
  /* CompleteClass */
  override val data: js.typedarray.Uint8ClampedArray = js.native
  
  /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
  /* standard DOM */
  /* CompleteClass */
  override val height: Double = js.native
  
  /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
  /* standard DOM */
  /* CompleteClass */
  override val width: Double = js.native
}
