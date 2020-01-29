object TinkLinkVersion {

    private const val major = 0
    private const val minor = 9
    private const val patch = 0

    const val name = "$major.$minor.$patch"

    private const val minorOffset = 100 //make space for 100 patches per minor version
    private const val majorOffset = 100 * minorOffset //make space for 100 minor versions per major version

    //Will generate a readable int representation of the version
    //For example 4.12.3 will be 412003
    const val code = major * majorOffset + minor * minorOffset + patch
}
