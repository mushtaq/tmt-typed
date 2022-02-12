package tmttyped.std.global

import org.scalajs.dom.EventListenerOptions
import tmttyped.std.AddEventListenerOptions
import tmttyped.std.EventListenerOrEventListenerObject
import tmttyped.std.WorkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SharedWorker")
@js.native
class SharedWorker protected ()
  extends StObject
     with tmttyped.std.SharedWorker {
  /* standard DOM */
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: org.scalajs.dom.URL) = this()
  def this(scriptURL: java.lang.String, options: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: WorkerOptions) = this()
  def this(scriptURL: org.scalajs.dom.URL, options: java.lang.String) = this()
  def this(scriptURL: org.scalajs.dom.URL, options: WorkerOptions) = this()
  
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
}
