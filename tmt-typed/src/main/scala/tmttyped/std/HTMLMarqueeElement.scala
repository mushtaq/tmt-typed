package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to manipulate <marquee> elements.
  * @deprecated
  */
@js.native
trait HTMLMarqueeElement
  extends StObject
     with HTMLElement {
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  var behavior: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var bgColor: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var direction: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var hspace: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  var loop: Double = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  var scrollAmount: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  var scrollDelay: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  def start(): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def stop(): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  var trueSpeed: scala.Boolean = js.native
  
  /** @deprecated */
  /* standard DOM */
  var vspace: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  var width: java.lang.String = js.native
}
