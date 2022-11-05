package tmttyped.std

import tmttyped.std.stdStrings.paymentmethodchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user.
  * Available only in secure contexts.
  */
@js.native
trait PaymentRequest
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  def abort(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  
  /* standard DOM */
  val id: java.lang.String = js.native
  
  /* standard DOM */
  var onpaymentmethodchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def show(): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: js.Thenable[PaymentDetailsUpdate]): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: PaymentDetailsUpdate): js.Promise[PaymentResponse] = js.native
}
