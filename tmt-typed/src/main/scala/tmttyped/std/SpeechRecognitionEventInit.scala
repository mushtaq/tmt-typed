package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechRecognitionEventInit extends EventInit {
  
  var resultIndex: js.UndefOr[Double] = js.undefined
  
  var results: SpeechRecognitionResultList
}
object SpeechRecognitionEventInit {
  
  @scala.inline
  def apply(results: SpeechRecognitionResultList): SpeechRecognitionEventInit = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventInit]
  }
  
  @scala.inline
  implicit class SpeechRecognitionEventInitMutableBuilder[Self <: SpeechRecognitionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultIndex(value: Double): Self = StObject.set(x, "resultIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultIndexUndefined: Self = StObject.set(x, "resultIndex", js.undefined)
    
    @scala.inline
    def setResults(value: SpeechRecognitionResultList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
