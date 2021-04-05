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
  
  @JSImport("node:v8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def cachedDataVersionTag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cachedDataVersionTag")().asInstanceOf[Double]
  
  /**
    * Uses a `DefaultDeserializer` with default options to read a JS value from a buffer.
    */
  @scala.inline
  def deserialize(data: TypedArray): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getHeapCodeStatistics(): HeapCodeStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapCodeStatistics")().asInstanceOf[HeapCodeStatistics]
  
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This conversation was marked as resolved by joyeecheung
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine, and may change from one version of V8 to the next.
    */
  @scala.inline
  def getHeapSnapshot(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSnapshot")().asInstanceOf[Readable]
  
  @scala.inline
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSpaceStatistics")().asInstanceOf[js.Array[HeapSpaceInfo]]
  
  @scala.inline
  def getHeapStatistics(): HeapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapInfo]
  
  /**
    * Uses a `DefaultSerializer` to serialize value into a buffer.
    */
  @scala.inline
  def serialize(value: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def setFlagsFromString(flags: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlagsFromString")(flags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    *
    * @param fileName The file path where the V8 heap snapshot is to be
    * saved. If not specified, a file name with the pattern
    * `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process,
    * `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from
    * the main Node.js thread or the id of a worker thread.
    */
  @scala.inline
  def writeHeapSnapshot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")().asInstanceOf[java.lang.String]
  @scala.inline
  def writeHeapSnapshot(fileName: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")(fileName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
