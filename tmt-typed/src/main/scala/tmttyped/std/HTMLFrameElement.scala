package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated */
@js.native
trait HTMLFrameElement
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
  
  /**
    * Retrieves the document object of the page or frame.
    * @deprecated
    */
  /* standard DOM */
  val contentDocument: org.scalajs.dom.Document | Null = js.native
  
  /**
    * Retrieves the object of the specified.
    * @deprecated
    */
  /* standard DOM */
  val contentWindow: org.scalajs.dom.Window | Null = js.native
  
  /**
    * Sets or retrieves whether to display a border for the frame.
    * @deprecated
    */
  /* standard DOM */
  var frameBorder: java.lang.String = js.native
  
  /**
    * Sets or retrieves a URI to a long description of the object.
    * @deprecated
    */
  /* standard DOM */
  var longDesc: java.lang.String = js.native
  
  /**
    * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
    * @deprecated
    */
  /* standard DOM */
  var marginHeight: java.lang.String = js.native
  
  /**
    * Sets or retrieves the left and right margin widths before displaying the text in a frame.
    * @deprecated
    */
  /* standard DOM */
  var marginWidth: java.lang.String = js.native
  
  /**
    * Sets or retrieves the frame name.
    * @deprecated
    */
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /**
    * Sets or retrieves whether the user can resize the frame.
    * @deprecated
    */
  /* standard DOM */
  var noResize: scala.Boolean = js.native
  
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
  
  /**
    * Sets or retrieves whether the frame can be scrolled.
    * @deprecated
    */
  /* standard DOM */
  var scrolling: java.lang.String = js.native
  
  /**
    * Sets or retrieves a URL to be loaded by the object.
    * @deprecated
    */
  /* standard DOM */
  var src: java.lang.String = js.native
}
