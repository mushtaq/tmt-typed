package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Channel Messaging API interface allows us to create a new message channel and send data through it via its two MessagePort properties. */
trait MessageChannel extends StObject {
  
  /** Returns the first MessagePort object. */
  /* standard DOM */
  val port1: org.scalajs.dom.MessagePort
  
  /** Returns the second MessagePort object. */
  /* standard DOM */
  val port2: org.scalajs.dom.MessagePort
}
object MessageChannel {
  
  @scala.inline
  def apply(port1: org.scalajs.dom.MessagePort, port2: org.scalajs.dom.MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannel]
  }
  
  @scala.inline
  implicit class MessageChannelMutableBuilder[Self <: MessageChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort1(value: org.scalajs.dom.MessagePort): Self = StObject.set(x, "port1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort2(value: org.scalajs.dom.MessagePort): Self = StObject.set(x, "port2", value.asInstanceOf[js.Any])
  }
}
