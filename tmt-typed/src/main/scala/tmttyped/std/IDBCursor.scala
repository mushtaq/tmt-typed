package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database. */
@js.native
trait IDBCursor extends StObject {
  
  /** Advances the cursor through the next count records in range. */
  /* standard DOM */
  def advance(count: Double): Unit = js.native
  
  /** Advances the cursor to the next record in range. */
  /* standard DOM */
  def continue(): Unit = js.native
  def continue(key: IDBValidKey): Unit = js.native
  
  /** Advances the cursor to the next record in range matching or after key and primaryKey. Throws an "InvalidAccessError" DOMException if the source is not an index. */
  /* standard DOM */
  def continuePrimaryKey(key: IDBValidKey, primaryKey: IDBValidKey): Unit = js.native
  
  /**
    * Delete the record pointed at by the cursor with a new value.
    *
    * If successful, request's result will be undefined.
    */
  /* standard DOM */
  def delete(): org.scalajs.dom.IDBRequest[Any, Unit] = js.native
  
  /** Returns the direction ("next", "nextunique", "prev" or "prevunique") of the cursor. */
  /* standard DOM */
  val direction: IDBCursorDirection = js.native
  
  /** Returns the key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished. */
  /* standard DOM */
  val key: IDBValidKey = js.native
  
  /** Returns the effective key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished. */
  /* standard DOM */
  val primaryKey: IDBValidKey = js.native
  
  /* standard DOM */
  val request: org.scalajs.dom.IDBRequest[Any, Any] = js.native
  
  /** Returns the IDBObjectStore or IDBIndex the cursor was opened from. */
  /* standard DOM */
  val source: org.scalajs.dom.IDBObjectStore | org.scalajs.dom.IDBIndex = js.native
  
  /**
    * Updated the record pointed at by the cursor with a new value.
    *
    * Throws a "DataError" DOMException if the effective object store uses in-line keys and the key would have changed.
    *
    * If successful, request's result will be the record's key.
    */
  /* standard DOM */
  def update(value: Any): org.scalajs.dom.IDBRequest[Any, IDBValidKey] = js.native
}
