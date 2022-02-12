package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface). */
@js.native
trait HTMLScriptElement
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
  
  /* standard DOM */
  var async: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard DOM */
  var charset: java.lang.String = js.native
  
  /* standard DOM */
  var crossOrigin: java.lang.String | Null = js.native
  
  /** Sets or retrieves the status of the script. */
  /* standard DOM */
  var defer: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the event for which the script is written.
    * @deprecated
    */
  /* standard DOM */
  var event: java.lang.String = js.native
  
  /**
    * Sets or retrieves the object that is bound to the event script.
    * @deprecated
    */
  /* standard DOM */
  var htmlFor: java.lang.String = js.native
  
  /* standard DOM */
  var integrity: java.lang.String = js.native
  
  /* standard DOM */
  var noModule: scala.Boolean = js.native
  
  /* standard DOM */
  var referrerPolicy: java.lang.String = js.native
  
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
  
  /** Retrieves the URL to an external file that contains the source code or data. */
  /* standard DOM */
  var src: java.lang.String = js.native
  
  /** Retrieves or sets the text of the object as a string. */
  /* standard DOM */
  var text: java.lang.String = js.native
  
  /** Sets or retrieves the MIME type for the associated scripting engine. */
  /* standard DOM */
  var `type`: java.lang.String = js.native
}
