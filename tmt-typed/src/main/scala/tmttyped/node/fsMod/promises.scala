package tmttyped.node.fsMod

import tmttyped.node.Buffer
import tmttyped.node.BufferEncoding
import tmttyped.node.anon.BaseEncodingOptionsflagOp
import tmttyped.node.anon.BaseEncodingOptionsmodeMo
import tmttyped.node.anon.BaseEncodingOptionswithFi
import tmttyped.node.anon.BaseEncodingOptionswithFiEncoding
import tmttyped.node.anon.BufferBytesWritten
import tmttyped.node.anon.BytesWritten
import tmttyped.node.anon.Encoding
import tmttyped.node.anon.EncodingFlag
import tmttyped.node.anon.Flag
import tmttyped.node.anon.MakeDirectoryOptionsrecur
import tmttyped.node.anon.MakeDirectoryOptionsrecurMode
import tmttyped.node.anon.StatOptionsbigintfalseund
import tmttyped.node.anon.StatOptionsbiginttrue
import tmttyped.node.nodeColonfsMod.FileHandle
import tmttyped.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promises {
  
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @JSImport("fs", "promises.access")
  @js.native
  def access(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.access")
  @js.native
  def access(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: PathLike, data: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.appendFile")
  @js.native
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSImport("fs", "promises.chmod")
  @js.native
  def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.chown")
  @js.native
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation. The only
    * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
    * `dest` already exists.
    */
  @JSImport("fs", "promises.copyFile")
  @js.native
  def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.copyFile")
  @js.native
  def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param handle A `FileHandle`.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSImport("fs", "promises.fchmod")
  @js.native
  def fchmod(handle: FileHandle, mode: Mode): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param handle A `FileHandle`.
    */
  @JSImport("fs", "promises.fchown")
  @js.native
  def fchown(handle: FileHandle, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param handle A `FileHandle`.
    */
  @JSImport("fs", "promises.fdatasync")
  @js.native
  def fdatasync(handle: FileHandle): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param handle A `FileHandle`.
    */
  @JSImport("fs", "promises.fsync")
  @js.native
  def fsync(handle: FileHandle): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param handle A `FileHandle`.
    * @param len If not specified, defaults to `0`.
    */
  @JSImport("fs", "promises.ftruncate")
  @js.native
  def ftruncate(handle: FileHandle): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.ftruncate")
  @js.native
  def ftruncate(handle: FileHandle, len: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied `FileHandle`.
    * @param handle A `FileHandle`.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: String, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: String, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: Double, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.futimes")
  @js.native
  def futimes(handle: FileHandle, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSImport("fs", "promises.lchmod")
  @js.native
  def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.lchown")
  @js.native
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.link")
  @js.native
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.lstat")
  @js.native
  def lstat(path: PathLike): js.Promise[tmttyped.node.nodeFsMod.Stats] = js.native
  @JSImport("fs", "promises.lstat")
  @js.native
  def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[tmttyped.node.nodeFsMod.Stats] = js.native
  @JSImport("fs", "promises.lstat")
  @js.native
  def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[tmttyped.node.nodeFsMod.BigIntStats] = js.native
  @JSImport("fs", "promises.lstat")
  @js.native
  def lstat(path: PathLike, opts: StatOptions): js.Promise[tmttyped.node.nodeFsMod.Stats | tmttyped.node.nodeFsMod.BigIntStats] = js.native
  
  /**
    * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
    * with the difference that if the path refers to a symbolic link, then the link is not
    * dereferenced: instead, the timestamps of the symbolic link itself are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.lutimes")
  @js.native
  def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSImport("fs", "promises.mkdir")
  @js.native
  def mkdir(path: PathLike): js.Promise[Unit] = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSImport("fs", "promises.mkdir")
  @js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("fs", "promises.mkdir")
  @js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.mkdir")
  @js.native
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("fs", "promises.mkdir")
  @js.native
  def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.mkdtemp")
  @js.native
  def mkdtemp(prefix: String): js.Promise[String] = js.native
  @JSImport("fs", "promises.mkdtemp")
  @js.native
  def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("fs", "promises.mkdtemp")
  @js.native
  def mkdtemp(prefix: String, options: BaseEncodingOptions): js.Promise[String] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.mkdtemp")
  @js.native
  def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = js.native
  
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
    * supplied, defaults to `0o666`.
    */
  @JSImport("fs", "promises.open")
  @js.native
  def open(path: PathLike, flags: String): js.Promise[FileHandle] = js.native
  @JSImport("fs", "promises.open")
  @js.native
  def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = js.native
  @JSImport("fs", "promises.open")
  @js.native
  def open(path: PathLike, flags: Double): js.Promise[FileHandle] = js.native
  @JSImport("fs", "promises.open")
  @js.native
  def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = js.native
  
  @JSImport("fs", "promises.opendir")
  @js.native
  def opendir(path: String): js.Promise[tmttyped.node.nodeFsMod.Dir] = js.native
  @JSImport("fs", "promises.opendir")
  @js.native
  def opendir(path: String, options: OpenDirOptions): js.Promise[tmttyped.node.nodeFsMod.Dir] = js.native
  
  /**
    * Asynchronously reads data from the file referenced by the supplied `FileHandle`.
    * @param handle A `FileHandle`.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If
    * `null`, data will be read from the current position.
    */
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  @JSImport("fs", "promises.read")
  @js.native
  def read[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
  
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: PathLike): js.Promise[Buffer] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: PathLike, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: PathLike, options: EncodingFlag): js.Promise[String] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: PathLike, options: Flag): js.Promise[Buffer] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: FileHandle): js.Promise[Buffer] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: FileHandle, options: BaseEncodingOptionsflagOp): js.Promise[String | Buffer] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: FileHandle, options: EncodingFlag): js.Promise[String] = js.native
  @JSImport("fs", "promises.readFile")
  @js.native
  def readFile(path: FileHandle, options: Flag): js.Promise[Buffer] = js.native
  
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.readdir")
  @js.native
  def readdir(path: PathLike): js.Promise[js.Array[String]] = js.native
  @JSImport("fs", "promises.readdir")
  @js.native
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  @JSImport("fs", "promises.readdir")
  @js.native
  def readdir(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  @JSImport("fs", "promises.readdir")
  @js.native
  def readdir(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[tmttyped.node.nodeFsMod.Dirent]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.readdir")
  @js.native
  def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = js.native
  @JSImport("fs", "promises.readdir")
  @js.native
  def readdir_buffer(path: PathLike, options: buffer_): js.Promise[js.Array[Buffer]] = js.native
  
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.readlink")
  @js.native
  def readlink(path: PathLike): js.Promise[String] = js.native
  @JSImport("fs", "promises.readlink")
  @js.native
  def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  @JSImport("fs", "promises.readlink")
  @js.native
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("fs", "promises.readlink")
  @js.native
  def readlink(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.readlink")
  @js.native
  def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
  
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.realpath")
  @js.native
  def realpath(path: PathLike): js.Promise[String] = js.native
  @JSImport("fs", "promises.realpath")
  @js.native
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSImport("fs", "promises.realpath")
  @js.native
  def realpath(path: PathLike, options: BaseEncodingOptions): js.Promise[String] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSImport("fs", "promises.realpath")
  @js.native
  def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
  
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @JSImport("fs", "promises.rename")
  @js.native
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
    */
  @JSImport("fs", "promises.rm")
  @js.native
  def rm(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.rm")
  @js.native
  def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.rmdir")
  @js.native
  def rmdir(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.rmdir")
  @js.native
  def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.stat")
  @js.native
  def stat(path: PathLike): js.Promise[tmttyped.node.nodeFsMod.Stats] = js.native
  @JSImport("fs", "promises.stat")
  @js.native
  def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[tmttyped.node.nodeFsMod.Stats] = js.native
  @JSImport("fs", "promises.stat")
  @js.native
  def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[tmttyped.node.nodeFsMod.BigIntStats] = js.native
  @JSImport("fs", "promises.stat")
  @js.native
  def stat(path: PathLike, opts: StatOptions): js.Promise[tmttyped.node.nodeFsMod.Stats | tmttyped.node.nodeFsMod.BigIntStats] = js.native
  
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  @JSImport("fs", "promises.symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.symlink")
  @js.native
  def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  @JSImport("fs", "promises.truncate")
  @js.native
  def truncate(path: PathLike): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.truncate")
  @js.native
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSImport("fs", "promises.unlink")
  @js.native
  def unlink(path: PathLike): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.utimes")
  @js.native
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously writes `string` to the file referenced by the supplied `FileHandle`.
    * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
    * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
    * @param handle A `FileHandle`.
    * @param string A string to write.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    * @param encoding The expected string encoding.
    */
  @JSImport("fs", "promises.write")
  @js.native
  def write(handle: FileHandle, string: String): js.Promise[BufferBytesWritten] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write(handle: FileHandle, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write(handle: FileHandle, string: String, position: Double): js.Promise[BufferBytesWritten] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write(handle: FileHandle, string: String, position: Double, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write(handle: FileHandle, string: String, position: Null, encoding: BufferEncoding): js.Promise[BufferBytesWritten] = js.native
  /**
    * Asynchronously writes `buffer` to the file referenced by the supplied `FileHandle`.
    * It is unsafe to call `fsPromises.write()` multiple times on the same file without waiting for the `Promise`
    * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
    * @param handle A `FileHandle`.
    * @param buffer The buffer that the data will be written to.
    * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
    * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
    * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
    */
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: Null,
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](
    handle: FileHandle,
    buffer: TBuffer,
    offset: Null,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  @JSImport("fs", "promises.write")
  @js.native
  def write[TBuffer /* <: js.typedarray.Uint8Array */](handle: FileHandle, buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[BytesWritten[TBuffer]] = js.native
  
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: PathLike, data: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: PathLike, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: PathLike, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: FileHandle, data: String): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: FileHandle, data: String, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("fs", "promises.writeFile")
  @js.native
  def writeFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BaseEncodingOptionsmodeMo): js.Promise[Unit] = js.native
}
