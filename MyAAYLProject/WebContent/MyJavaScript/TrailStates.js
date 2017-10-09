/**
 * 
 */
$( function() {
    var cityTags = [
      "AhmedNagar","Pune","Nasik","Kolhapur"
      
    ];
    $( "#fromcity" ).autocomplete({
      source: cityTags
    });
  } );


$( function() {
    var availableTags = [
"AhmedNagar","Pune","Nasik","Kolhapur"
    ];
    $( "#tocity" ).autocomplete({
      source: availableTags
    });
  } );

