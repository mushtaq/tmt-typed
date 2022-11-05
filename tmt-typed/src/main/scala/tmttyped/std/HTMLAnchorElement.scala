package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Hyperlink elements and provides special properties and methods (beyond those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and presentation of such elements. */
@js.native
trait HTMLAnchorElement
  extends StObject
     with HTMLElement
     with HTMLHyperlinkElementUtils {
  
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
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard DOM */
  var charset: java.lang.String = js.native
  
  /**
    * Sets or retrieves the coordinates of the object.
    * @deprecated
    */
  /* standard DOM */
  var coords: java.lang.String = js.native
  
  /* standard DOM */
  var download: java.lang.String = js.native
  
  /** Sets or retrieves the language code of the object. */
  /* standard DOM */
  var hreflang: java.lang.String = js.native
  
  /**
    * Sets or retrieves the shape of the object.
    * @deprecated
    */
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /* standard DOM */
  var ping: java.lang.String = js.native
  
  /* standard DOM */
  var referrerPolicy: java.lang.String = js.native
  
  /** Sets or retrieves the relationship between the object and the destination of the link. */
  /* standard DOM */
  var rel: java.lang.String = js.native
  
  /* standard DOM */
  val relList: org.scalajs.dom.DOMTokenList = js.native
  
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
    * Sets or retrieves the relationship between the object and the destination of the link.
    * @deprecated
    */
  /* standard DOM */
  var rev: java.lang.String = js.native
  
  /**
    * Sets or retrieves the shape of the object.
    * @deprecated
    */
  /* standard DOM */
  var shape: java.lang.String = js.native
  
  /** Sets or retrieves the window or frame at which to target content. */
  /* standard DOM */
  var target: java.lang.String = js.native
  
  /** Retrieves or sets the text of the object as a string. */
  /* standard DOM */
  var text: java.lang.String = js.native
  
  /* standard DOM */
  var `type`: java.lang.String = js.native
}
