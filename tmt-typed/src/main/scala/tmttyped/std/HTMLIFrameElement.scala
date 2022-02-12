package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements. */
@js.native
trait HTMLIFrameElement
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
    * Sets or retrieves how the object is aligned with adjacent text.
    * @deprecated
    */
  /* standard DOM */
  var align: java.lang.String = js.native
  
  /* standard DOM */
  var allow: java.lang.String = js.native
  
  /* standard DOM */
  var allowFullscreen: scala.Boolean = js.native
  
  /** Retrieves the document object of the page or frame. */
  /* standard DOM */
  val contentDocument: org.scalajs.dom.Document | Null = js.native
  
  /** Retrieves the object of the specified. */
  /* standard DOM */
  val contentWindow: org.scalajs.dom.Window | Null = js.native
  
  /**
    * Sets or retrieves whether to display a border for the frame.
    * @deprecated
    */
  /* standard DOM */
  var frameBorder: java.lang.String = js.native
  
  /* standard DOM */
  def getSVGDocument(): org.scalajs.dom.Document | Null = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard DOM */
  var height: java.lang.String = js.native
  
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
  
  /** Sets or retrieves the frame name. */
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /* standard DOM */
  var referrerPolicy: org.scalajs.dom.ReferrerPolicy = js.native
  
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
  
  /* standard DOM */
  val sandbox: org.scalajs.dom.DOMTokenList = js.native
  
  /**
    * Sets or retrieves whether the frame can be scrolled.
    * @deprecated
    */
  /* standard DOM */
  var scrolling: java.lang.String = js.native
  
  /** Sets or retrieves a URL to be loaded by the object. */
  /* standard DOM */
  var src: java.lang.String = js.native
  
  /** Sets or retrives the content of the page that is to contain. */
  /* standard DOM */
  var srcdoc: java.lang.String = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard DOM */
  var width: java.lang.String = js.native
}
