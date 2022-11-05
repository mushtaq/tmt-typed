package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLLinkElement
  extends StObject
     with HTMLElement
     with LinkStyle {
  
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
  
  /* standard DOM */
  var as: java.lang.String = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard DOM */
  var charset: java.lang.String = js.native
  
  /* standard DOM */
  var crossOrigin: java.lang.String | Null = js.native
  
  /* standard DOM */
  var disabled: scala.Boolean = js.native
  
  /** Sets or retrieves a destination URL or an anchor point. */
  /* standard DOM */
  var href: java.lang.String = js.native
  
  /** Sets or retrieves the language code of the object. */
  /* standard DOM */
  var hreflang: java.lang.String = js.native
  
  /* standard DOM */
  var imageSizes: java.lang.String = js.native
  
  /* standard DOM */
  var imageSrcset: java.lang.String = js.native
  
  /* standard DOM */
  var integrity: java.lang.String = js.native
  
  /** Sets or retrieves the media type. */
  /* standard DOM */
  var media: java.lang.String = js.native
  
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
  
  /* standard DOM */
  val sizes: org.scalajs.dom.DOMTokenList = js.native
  
  /**
    * Sets or retrieves the window or frame at which to target content.
    * @deprecated
    */
  /* standard DOM */
  var target: java.lang.String = js.native
  
  /** Sets or retrieves the MIME type of the object. */
  /* standard DOM */
  var `type`: java.lang.String = js.native
}
