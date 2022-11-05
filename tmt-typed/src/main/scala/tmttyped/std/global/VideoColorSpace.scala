package tmttyped.std.global

import tmttyped.std.VideoColorPrimaries
import tmttyped.std.VideoColorSpaceInit
import tmttyped.std.VideoMatrixCoefficients
import tmttyped.std.VideoTransferCharacteristics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoColorSpace")
@js.native
/* standard DOM */
open class VideoColorSpace ()
  extends StObject
     with tmttyped.std.VideoColorSpace {
  def this(init: VideoColorSpaceInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override val fullRange: scala.Boolean | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val matrix: VideoMatrixCoefficients | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val primaries: VideoColorPrimaries | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def toJSON(): VideoColorSpaceInit = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val transfer: VideoTransferCharacteristics | Null = js.native
}
