package net.glowstone.util.nbt;

/**
 * The {@code TAG_Double} tag.
 */
final class DoubleTag extends Tag<Double> {

    /**
     * The value.
     */
    private final double value;

    /**
     * Creates the tag.
     * @param value The value.
     */
    public DoubleTag(double value) {
        super(TagType.DOUBLE);
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }

}

