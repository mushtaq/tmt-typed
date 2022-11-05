package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <embed> elements. */
@js.native
trait HTMLEmbedElement
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
  var align: java.lang.String = js.native
  
  /* standard DOM */
  def getSVGDocument(): org.scalajs.dom.Document | Null = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard DOM */
  var height: java.lang.String = js.native
  
  /**
    * Sets or retrieves the name of the object.
    * @deprecated
    */
  /* standard DOM */
  var name: java.lang.String = js.native
  
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
  
  /** Sets or retrieves a URL to be loaded by the object. */
  /* standard DOM */
  var src: java.lang.String = js.native
  
  /* standard DOM */
  var `type`: java.lang.String = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard DOM */
  var width: java.lang.String = js.native
}
