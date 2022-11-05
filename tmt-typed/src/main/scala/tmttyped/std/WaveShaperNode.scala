package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A WaveShaperNode always has exactly one input and one output. */
@js.native
trait WaveShaperNode
  extends StObject
     with AudioNode {
  
  /* standard DOM */
  var curve: js.typedarray.Float32Array | Null = js.native
  
  /* standard DOM */
  var oversample: OverSampleType = js.native
}
