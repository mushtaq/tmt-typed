package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoColorSpace extends StObject {
  
  /* standard DOM */
  val fullRange: scala.Boolean | Null
  
  /* standard DOM */
  val matrix: VideoMatrixCoefficients | Null
  
  /* standard DOM */
  val primaries: VideoColorPrimaries | Null
  
  /* standard DOM */
  def toJSON(): VideoColorSpaceInit
  
  /* standard DOM */
  val transfer: VideoTransferCharacteristics | Null
}
object VideoColorSpace {
  
  inline def apply(toJSON: () => VideoColorSpaceInit): VideoColorSpace = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), fullRange = null, matrix = null, primaries = null, transfer = null)
    __obj.asInstanceOf[VideoColorSpace]
  }
  
  extension [Self <: VideoColorSpace](x: Self) {
    
    inline def setFullRange(value: scala.Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeNull: Self = StObject.set(x, "fullRange", null)
    
    inline def setMatrix(value: VideoMatrixCoefficients): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixNull: Self = StObject.set(x, "matrix", null)
    
    inline def setPrimaries(value: VideoColorPrimaries): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesNull: Self = StObject.set(x, "primaries", null)
    
    inline def setToJSON(value: () => VideoColorSpaceInit): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setTransfer(value: VideoTransferCharacteristics): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferNull: Self = StObject.set(x, "transfer", null)
  }
}
