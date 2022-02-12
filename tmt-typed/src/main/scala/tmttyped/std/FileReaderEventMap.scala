package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReaderEventMap extends StObject {
  
  /* standard DOM */
  var abort: org.scalajs.dom.ProgressEvent
  
  /* standard DOM */
  var error: org.scalajs.dom.ProgressEvent
  
  /* standard DOM */
  var load: org.scalajs.dom.ProgressEvent
  
  /* standard DOM */
  var loadend: org.scalajs.dom.ProgressEvent
  
  /* standard DOM */
  var loadstart: org.scalajs.dom.ProgressEvent
  
  /* standard DOM */
  var progress: org.scalajs.dom.ProgressEvent
}
object FileReaderEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.ProgressEvent,
    error: org.scalajs.dom.ProgressEvent,
    load: org.scalajs.dom.ProgressEvent,
    loadend: org.scalajs.dom.ProgressEvent,
    loadstart: org.scalajs.dom.ProgressEvent,
    progress: org.scalajs.dom.ProgressEvent
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReaderEventMap]
  }
  
  @scala.inline
  implicit class FileReaderEventMapMutableBuilder[Self <: FileReaderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadend(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadstart(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
