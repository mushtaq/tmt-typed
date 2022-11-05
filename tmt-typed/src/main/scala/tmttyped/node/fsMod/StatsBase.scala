package tmttyped.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsBase[T] extends StObject {
  
  var atime: js.Date
  
  var atimeMs: T
  
  var birthtime: js.Date
  
  var birthtimeMs: T
  
  var blksize: T
  
  var blocks: T
  
  var ctime: js.Date
  
  var ctimeMs: T
  
  var dev: T
  
  var gid: T
  
  var ino: T
  
  def isBlockDevice(): Boolean
  
  def isCharacterDevice(): Boolean
  
  def isDirectory(): Boolean
  
  def isFIFO(): Boolean
  
  def isFile(): Boolean
  
  def isSocket(): Boolean
  
  def isSymbolicLink(): Boolean
  
  var mode: T
  
  var mtime: js.Date
  
  var mtimeMs: T
  
  var nlink: T
  
  var rdev: T
  
  var size: T
  
  var uid: T
}
object StatsBase {
  
  inline def apply[T](
    atime: js.Date,
    atimeMs: T,
    birthtime: js.Date,
    birthtimeMs: T,
    blksize: T,
    blocks: T,
    ctime: js.Date,
    ctimeMs: T,
    dev: T,
    gid: T,
    ino: T,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: T,
    mtime: js.Date,
    mtimeMs: T,
    nlink: T,
    rdev: T,
    size: T,
    uid: T
  ): StatsBase[T] = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsBase[T]]
  }
  
  extension [Self <: StatsBase[?], T](x: Self & StatsBase[T]) {
    
    inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setAtimeMs(value: T): Self = StObject.set(x, "atimeMs", value.asInstanceOf[js.Any])
    
    inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
    
    inline def setBirthtimeMs(value: T): Self = StObject.set(x, "birthtimeMs", value.asInstanceOf[js.Any])
    
    inline def setBlksize(value: T): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
    
    inline def setBlocks(value: T): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setCtimeMs(value: T): Self = StObject.set(x, "ctimeMs", value.asInstanceOf[js.Any])
    
    inline def setDev(value: T): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setGid(value: T): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setIno(value: T): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
    
    inline def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
    
    inline def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
    
    inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    inline def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
    
    inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    inline def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
    
    inline def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
    
    inline def setMode(value: T): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeMs(value: T): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
    
    inline def setNlink(value: T): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
    
    inline def setRdev(value: T): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
    
    inline def setSize(value: T): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUid(value: T): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
