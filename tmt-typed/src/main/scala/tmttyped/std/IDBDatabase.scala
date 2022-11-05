package tmttyped.std

import tmttyped.std.stdStrings.abort
import tmttyped.std.stdStrings.close
import tmttyped.std.stdStrings.error
import tmttyped.std.stdStrings.versionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This IndexedDB API interface provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database. */
@js.native
trait IDBDatabase
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Closes the connection once all running transactions have finished. */
  /* standard DOM */
  def close(): Unit = js.native
  
  /**
    * Creates a new object store with the given name and options and returns a new IDBObjectStore.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  /* standard DOM */
  def createObjectStore(name: java.lang.String): org.scalajs.dom.IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, options: IDBObjectStoreParameters): org.scalajs.dom.IDBObjectStore = js.native
  
  /**
    * Deletes the object store with the given name.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  /* standard DOM */
  def deleteObjectStore(name: java.lang.String): Unit = js.native
  
  /** Returns the name of the database. */
  /* standard DOM */
  val name: java.lang.String = js.native
  
  /** Returns a list of the names of object stores in the database. */
  /* standard DOM */
  val objectStoreNames: org.scalajs.dom.DOMStringList = js.native
  
  /* standard DOM */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onversionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any]) | Null = js.native
  
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names. */
  /* standard DOM.Iterable */
  def transaction(storeNames: java.lang.String): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: Unit, options: IDBTransactionOptions): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode, options: IDBTransactionOptions): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: Unit, options: IDBTransactionOptions): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode, options: IDBTransactionOptions): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Iterable[java.lang.String]): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Iterable[java.lang.String], mode: Unit, options: IDBTransactionOptions): org.scalajs.dom.IDBTransaction = js.native
  def transaction(storeNames: js.Iterable[java.lang.String], mode: IDBTransactionMode): org.scalajs.dom.IDBTransaction = js.native
  def transaction(
    storeNames: js.Iterable[java.lang.String],
    mode: IDBTransactionMode,
    options: IDBTransactionOptions
  ): org.scalajs.dom.IDBTransaction = js.native
  
  /** Returns the version of the database. */
  /* standard DOM */
  val version: Double = js.native
}
