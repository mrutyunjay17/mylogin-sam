/**
 * 
 */
// District lists
var districts = new Array();

districts['Maharashtra'] = new Array('Select District','Nashik','Pune','Ahmednagar');
districts['Gujrat'] = new Array('Select District','Dang','Kheda','Panchmahal');
districts['Punjab'] = new Array('Select District','Amritsar','Barnala','Bathinda');


// City lists
var cities = new Array();

cities['Maharashtra'] = new Array();
cities['Maharashtra']['Nashik'] = new Array('Select City','Malegaon','Nashik','Manmad');
cities['Maharashtra']['Pune'] = new Array('Select City','Pimri','Chinchwad','Shivajinagar','Alandi');
cities['Maharashtra']['Ahmednagar']= new Array('Select City','Kopargaon','Ahmednagar','Shirdi');

cities['Gujrat'] = new Array();
cities['Gujrat']['Dang'] = new Array('Select City','Subir','Ahwa');
cities['Gujrat']['Kheda']= new Array('Select City','Chaklasi','Anand');
cities['Gujrat']['Panchmahal']= new Array('Select City','Champaner','Halol');

cities['Punjab'] = new Array();
cities['Punjab']['Amritsar'] = new Array('Select City','Patiyala','Amritsar','Jalandhar');
cities['Punjab']['Barnala']    = new Array('Select City','Mansa','Barnala');
cities['Punjab']['Bathinda']   = new Array('Select City','Nathna','Naman','Rampura');

//Selects for "From" list
function setDistricts() {
  stateSel = document.getElementById('state');
  districtList = districts[stateSel.value];
  changeSelect('district', districtList, districtList);
  setCities();
}

function setCities() {
	stateSel = document.getElementById('state');
districtSel = document.getElementById('district');
  cityList = cities[stateSel.value][districtSel.value];
  changeSelect('city', cityList, cityList);
}

//select for "To" List
function setDistricts1() {
	  stateSel = document.getElementById('state1');
	  districtList1 = districts[stateSel.value];
	  changeSelect('district1', districtList1, districtList1);
	  setCities1();
	}

	function setCities1() {
		stateSel = document.getElementById('state1');
	districtSel = document.getElementById('district1');
	  cityList1 = cities[stateSel.value][districtSel.value];
	  changeSelect('city1', cityList1, cityList1);
	}

	

function changeSelect(fieldID, newOptions, newValues) {
  selectField = document.getElementById(fieldID);
  selectField.options.length = 0;
  for (i=0; i<newOptions.length; i++) {
    selectField.options[selectField.length] = new Option(newOptions[i], newValues[i]);
  }
}



