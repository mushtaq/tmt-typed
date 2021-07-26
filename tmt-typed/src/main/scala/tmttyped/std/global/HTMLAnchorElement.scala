package tmttyped.std.global

import org.scalajs.dom.raw.EventListenerOptions
import tmttyped.std.AddEventListenerOptions
import tmttyped.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("HTMLAnchorElement")
@js.native
class HTMLAnchorElement ()
  extends StObject
     with tmttyped.std.HTMLAnchorElement {
  
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
  
  /* CompleteClass */
  override val assignedSlot: tmttyped.std.HTMLSlotElement | Null = js.native
  
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  
  /* CompleteClass */
  override var enterKeyHint: java.lang.String = js.native
  
  /* CompleteClass */
  override var hash: java.lang.String = js.native
  
  /* CompleteClass */
  override var host: java.lang.String = js.native
  
  /* CompleteClass */
  override var hostname: java.lang.String = js.native
  
  /* CompleteClass */
  override var href: java.lang.String = js.native
  
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* CompleteClass */
  override var password: java.lang.String = js.native
  
  /* CompleteClass */
  override var pathname: java.lang.String = js.native
  
  /* CompleteClass */
  override var port: java.lang.String = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /* CompleteClass */
  override var protocol: java.lang.String = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* CompleteClass */
  override var search: java.lang.String = js.native
  
  /* CompleteClass */
  override val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  
  /* CompleteClass */
  override var username: java.lang.String = js.native
}
