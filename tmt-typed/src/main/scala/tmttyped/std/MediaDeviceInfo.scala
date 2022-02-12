package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MediaDevicesInfo interface contains information that describes a single media input or output device.
  * Available only in secure contexts.
  */
trait MediaDeviceInfo extends StObject {
  
  /* standard DOM */
  val deviceId: java.lang.String
  
  /* standard DOM */
  val groupId: java.lang.String
  
  /* standard DOM */
  val kind: org.scalajs.dom.MediaDeviceKind
  
  /* standard DOM */
  val label: java.lang.String
  
  /* standard DOM */
  def toJSON(): Any
}
object MediaDeviceInfo {
  
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: org.scalajs.dom.MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => Any
  ): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MediaDeviceInfo]
  }
  
  @scala.inline
  implicit class MediaDeviceInfoMutableBuilder[Self <: MediaDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: org.scalajs.dom.MediaDeviceKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
