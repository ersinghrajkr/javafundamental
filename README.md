# Java Fundamental

## File Structure

#### Public Class In a File

A file can have multiple Java Classes. But maximum one class can be public.

If anyone of the class is public in a file then file can be saved with public class name.

#### No Public Class In a File

If no class is public then file can be saved with anyname.

#### Import Statement

For Best practices or readability always go with Explicit Import instead of Implicit Import. For example -

Best( Explicit Import ) => import java.util.ArrayList

Bad( Implicit Import ) => import java.util.*


Import statement, is not required for classes, packages etc if they are in same/current working directory.

Whatever available in "java.lang.*" packege, import statement is not required because by default they are available.
