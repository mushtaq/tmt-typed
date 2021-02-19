package tmttyped.node

import tmttyped.node.NodeJS.TypedArray
import tmttyped.node.nodeStreamMod.Readable
import tmttyped.node.v8Mod.HeapCodeStatistics
import tmttyped.node.v8Mod.HeapInfo
import tmttyped.node.v8Mod.HeapSpaceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeV8Mod {
  
  /**
    * A subclass of `Serializer` that serializes `TypedArray` (in particular `Buffer`) and `DataView` objects as host objects,
    * and only stores the part of their underlying `ArrayBuffers` that they are referring to.
    */
  @JSImport("node:v8", "DefaultDeserializer")
  @js.native
  class DefaultDeserializer protected ()
    extends tmttyped.node.v8Mod.DefaultDeserializer {
    def this(data: TypedArray) = this()
  }
  
  /**
    * A subclass of `Serializer` that serializes `TypedArray` (in particular `Buffer`) and `DataView` objects as host objects,
    * and only stores the part of their underlying `ArrayBuffers` that they are referring to.
    */
  @JSImport("node:v8", "DefaultSerializer")
  @js.native
  class DefaultSerializer ()
    extends tmttyped.node.v8Mod.DefaultSerializer
  
  @JSImport("node:v8", "Deserializer")
  @js.native
  class Deserializer protected ()
    extends tmttyped.node.v8Mod.Deserializer {
    def this(data: TypedArray) = this()
  }
  
  @JSImport("node:v8", "Serializer")
  @js.native
  class Serializer ()
    extends tmttyped.node.v8Mod.Serializer
  
  /**
    * Returns an integer representing a "version tag" derived from the V8 version, command line flags and detected CPU features.
    * This is useful for determining whether a vm.Script cachedData buffer is compatible with this instance of V8.
    */
  @JSImport("node:v8", "cachedDataVersionTag")
  @js.native
  def cachedDataVersionTag(): Double = js.native
  
  /**
    * Uses a `DefaultDeserializer` with default options to read a JS value from a buffer.
    */
  @JSImport("node:v8", "deserialize")
  @js.native
  def deserialize(data: TypedArray): js.Any = js.native
  
  @JSImport("node:v8", "getHeapCodeStatistics")
  @js.native
  def getHeapCodeStatistics(): HeapCodeStatistics = js.native
  
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This conversation was marked as resolved by joyeecheung
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine, and may change from one version of V8 to the next.
    */
  @JSImport("node:v8", "getHeapSnapshot")
  @js.native
  def getHeapSnapshot(): Readable = js.native
  
  @JSImport("node:v8", "getHeapSpaceStatistics")
  @js.native
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = js.native
  
  @JSImport("node:v8", "getHeapStatistics")
  @js.native
  def getHeapStatistics(): HeapInfo = js.native
  
  /**
    * Uses a `DefaultSerializer` to serialize value into a buffer.
    */
  @JSImport("node:v8", "serialize")
  @js.native
  def serialize(value: js.Any): Buffer = js.native
  
  @JSImport("node:v8", "setFlagsFromString")
  @js.native
  def setFlagsFromString(flags: java.lang.String): Unit = js.native
  
  /**
    *
    * @param fileName The file path where the V8 heap snapshot is to be
    * saved. If not specified, a file name with the pattern
    * `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process,
    * `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from
    * the main Node.js thread or the id of a worker thread.
    */
  @JSImport("node:v8", "writeHeapSnapshot")
  @js.native
  def writeHeapSnapshot(): java.lang.String = js.native
  @JSImport("node:v8", "writeHeapSnapshot")
  @js.native
  def writeHeapSnapshot(fileName: java.lang.String): java.lang.String = js.native
}
