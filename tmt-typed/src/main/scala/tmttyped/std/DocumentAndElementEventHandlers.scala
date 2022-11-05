package tmttyped.std

import tmttyped.std.stdStrings.copy
import tmttyped.std.stdStrings.cut
import tmttyped.std.stdStrings.paste
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAndElementEventHandlers extends StObject {
  
  /* standard DOM */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]) | Null = js.native
  
  /* standard DOM */
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ClipboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
}
