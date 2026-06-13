package me.jddev0.epct.datagen.recipe;

import com.epherical.croptopia.common.MiscNames;
import com.epherical.croptopia.register.Content;
import com.epherical.croptopia.register.helpers.FarmlandCrop;
import me.jddev0.ep.recipe.*;
import me.jddev0.ep.soil.EPSoilTypeTags;
import me.jddev0.ep.soil.SoilType;
import me.jddev0.epct.EnergizedPowerCTMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public class ModRecipeGenerator extends RecipeProvider {
    private static final String CROPTOPIA_MOD_ID = MiscNames.MOD_ID;
    private static final String PATH_PREFIX = "compat/" + CROPTOPIA_MOD_ID + "/";

    public ModRecipeGenerator(HolderLookup.Provider registries, RecipeOutput exporter) {
        super(registries, exporter);
    }

    @Override
    public void buildRecipes() {
        buildPulverizerRecipes(output);
        buildPlantGrowthChamberRecipes(output);
    }

    private void buildPulverizerRecipes(RecipeOutput output) {
        addPulverizerRecipe(output, ingredientOf(Content.SALT_ORE),
                new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStackTemplate(Content.SALT), new double[] {
                        1., 1., 1., 1., .5, .5
                }, new double[] {
                        1., 1., 1., 1., .75, .5, .25
                }),
                "salt_ore");
    }

    private void buildPlantGrowthChamberRecipes(RecipeOutput output) {
        addBasicCropGrowingRecipeNoSeeds(Content.ARTICHOKE);
        addBasicCropGrowingRecipeNoSeeds(Content.ASPARAGUS);
        addBasicCropGrowingRecipeNoSeeds(Content.BARLEY);
        addBasicCropGrowingRecipeNoSeeds(Content.BASIL);
        addBasicCropGrowingRecipeNoSeeds(Content.BELLPEPPER);
        addBasicCropGrowingRecipeNoSeeds(Content.BLACKBEAN);
        addBasicCropGrowingRecipeNoSeeds(Content.BLACKBERRY);
        addBasicCropGrowingRecipeNoSeeds(Content.BLUEBERRY);
        addBasicCropGrowingRecipeNoSeeds(Content.BROCCOLI);
        addBasicCropGrowingRecipeNoSeeds(Content.CABBAGE);
        addBasicCropGrowingRecipeNoSeeds(Content.CANTALOUPE);
        addBasicCropGrowingRecipeNoSeeds(Content.CAULIFLOWER);
        addBasicCropGrowingRecipeNoSeeds(Content.CELERY);
        addBasicCropGrowingRecipeNoSeeds(Content.CHILE_PEPPER);
        addBasicCropGrowingRecipeNoSeeds(Content.COFFEE_BEANS);
        addBasicCropGrowingRecipeNoSeeds(Content.CORN);
        addBasicCropGrowingRecipeNoSeeds(Content.CRANBERRY);
        addBasicCropGrowingRecipeNoSeeds(Content.CUCUMBER);
        addBasicCropGrowingRecipeNoSeeds(Content.CURRANT);
        addBasicCropGrowingRecipeNoSeeds(Content.EGGPLANT);
        addBasicCropGrowingRecipeNoSeeds(Content.ELDERBERRY);
        addBasicCropGrowingRecipeNoSeeds(Content.GARLIC);
        addBasicCropGrowingRecipeNoSeeds(Content.GINGER);
        addBasicCropGrowingRecipeNoSeeds(Content.GRAPE);
        addBasicCropGrowingRecipeNoSeeds(Content.GREENBEAN);
        addBasicCropGrowingRecipeNoSeeds(Content.GREENONION);
        addBasicCropGrowingRecipeNoSeeds(Content.HONEYDEW);
        addBasicCropGrowingRecipeNoSeeds(Content.HOPS);
        addBasicCropGrowingRecipeNoSeeds(Content.KALE);
        addBasicCropGrowingRecipeNoSeeds(Content.KIWI);
        addBasicCropGrowingRecipeNoSeeds(Content.LEEK);
        addBasicCropGrowingRecipeNoSeeds(Content.LETTUCE);
        addBasicCropGrowingRecipeNoSeeds(Content.MUSTARD);
        addBasicCropGrowingRecipeNoSeeds(Content.OAT);
        addBasicCropGrowingRecipeNoSeeds(Content.OLIVE);
        addBasicCropGrowingRecipeNoSeeds(Content.ONION);
        addBasicCropGrowingRecipeNoSeeds(Content.PEANUT);
        addBasicCropGrowingRecipeNoSeeds(Content.PEPPER);
        addBasicCropGrowingRecipeNoSeeds(Content.PINEAPPLE);
        addBasicCropGrowingRecipeNoSeeds(Content.RADISH);
        addBasicCropGrowingRecipeNoSeeds(Content.RASPBERRY);
        addBasicCropGrowingRecipeNoSeeds(Content.RHUBARB);
        addBasicCropGrowingRecipeNoSeeds(Content.RICE);
        addBasicCropGrowingRecipeNoSeeds(Content.RUTABAGA);
        addBasicCropGrowingRecipeNoSeeds(Content.SAGUARO);
        addBasicCropGrowingRecipeNoSeeds(Content.SOYBEAN);
        addBasicCropGrowingRecipeNoSeeds(Content.SPINACH);
        addBasicCropGrowingRecipeNoSeeds(Content.SQUASH);
        addBasicCropGrowingRecipeNoSeeds(Content.STRAWBERRY);
        addBasicCropGrowingRecipeNoSeeds(Content.SWEETPOTATO);
        addBasicCropGrowingRecipeNoSeeds(Content.TEA_LEAVES);
        addBasicCropGrowingRecipeNoSeeds(Content.TOMATILLO);
        addBasicCropGrowingRecipeNoSeeds(Content.TOMATO);
        addBasicCropGrowingRecipeNoSeeds(Content.TURMERIC);
        addBasicCropGrowingRecipeNoSeeds(Content.TURNIP);
        addBasicCropGrowingRecipeNoSeeds(Content.VANILLA);
        addBasicCropGrowingRecipeNoSeeds(Content.YAM);
        addBasicCropGrowingRecipeNoSeeds(Content.ZUCCHINI);
    }

    private void addPulverizerRecipe(RecipeOutput recipeOutput, Ingredient input,
                                     PulverizerRecipe.OutputItemStackWithPercentages output,
                                     String recipeIngredientName) {
        addPulverizerRecipe(recipeOutput, input, output,
                new PulverizerRecipe.OutputItemStackWithPercentages(null, new double[0], new double[0]), recipeIngredientName);
    }
    private void addPulverizerRecipe(RecipeOutput recipeOutput, Ingredient input,
                                     PulverizerRecipe.OutputItemStackWithPercentages output,
                                     PulverizerRecipe.OutputItemStackWithPercentages secondaryOutput,
                                     String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerCTMod.MODID, PATH_PREFIX + "pulverizer/" +
                getItemName(output.output().item().value()) + "_from_pulverizing_" + recipeIngredientName);

        PulverizerRecipe recipe = new PulverizerRecipe(output, secondaryOutput, input);
        recipeOutput.accept(getKey(recipeId), recipe, null);
    }

    private void addBasicCropGrowingRecipeNoSeeds(FarmlandCrop farmlandCrop) {
        addPlantGrowthChamberRecipe(ingredientOf(farmlandCrop.getSeedItem()), new OutputItemStackTemplateWithPercentages[] {
                new OutputItemStackTemplateWithPercentages(new ItemStackTemplate(farmlandCrop.asItem()), new double[] {
                        1., .75, .25, .25
                }),
        }, EPSoilTypeTags.CROPS, Fluids.WATER, 0.0625, 4000, getItemName(farmlandCrop.asItem()), getItemName(farmlandCrop.getSeedItem()));
    }
    private void addPlantGrowthChamberRecipe(Ingredient input,
                                             OutputItemStackTemplateWithPercentages[] outputs,
                                             TagKey<SoilType> soilType,
                                             Fluid fluid, double fluidConsumption, int ticks,
                                             String outputName, String recipeIngredientName) {
        addPlantGrowthChamberRecipe(input, outputs, soilType, new Fluid[] {fluid}, fluidConsumption, ticks, outputName, recipeIngredientName);
    }
    private void addPlantGrowthChamberRecipe(Ingredient input,
                                             OutputItemStackTemplateWithPercentages[] outputs,
                                             TagKey<SoilType> soilType,
                                             Fluid[] fluid, double fluidConsumption, int ticks,
                                             String outputName, String recipeIngredientName) {
        Identifier recipeId = Identifier.fromNamespaceAndPath(EnergizedPowerCTMod.MODID, PATH_PREFIX + "growing/" +
                outputName + "_from_growing_" + recipeIngredientName);

        PlantGrowthChamberRecipe recipe = new PlantGrowthChamberRecipe(outputs, input, soilType, fluid, fluidConsumption, ticks);
        this.output.accept(getKey(recipeId), recipe, null);
    }

    private Ingredient ingredientOf(ItemLike item) {
        return Ingredient.of(item);
    }

    private Ingredient ingredientOf(ItemLike... items) {
        return Ingredient.of(items);
    }

    private Ingredient ingredientOf(TagKey<Item> tagKey) {
        return Ingredient.of(registries.lookupOrThrow(Registries.ITEM).getOrThrow(tagKey));
    }

    private static ResourceKey<Recipe<?>> getKey(Identifier recipeId) {
        return ResourceKey.create(Registries.RECIPE, recipeId);
    }
}
